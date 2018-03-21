/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.service;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.RejectedExecutionException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.recharge.api.bo.RechargeBO;
import com.roncoo.recharge.api.bo.RechargeNotifyBO;
import com.roncoo.recharge.api.dto.RechargeDTO;
import com.roncoo.recharge.api.dto.RechargeNotifyDTO;
import com.roncoo.recharge.api.facade.RechargeFacade;
import com.roncoo.recharge.api.request.ExchangeOrderRequest;
import com.roncoo.recharge.api.request.RechargeRequest;
import com.roncoo.recharge.api.response.ExchangeOrderResponse;
import com.roncoo.recharge.api.response.RechargeResponse;
import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.gateway.service.manager.RechargeManager;
import com.roncoo.recharge.util.ConfigUtil;
import com.roncoo.recharge.util.MapObjectUtil;
import com.roncoo.recharge.util.SignUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.OrderStatusEnum;
import com.roncoo.recharge.util.enums.ResultEnum;
import com.roncoo.recharge.util.enums.TradeStatusEnum;
import com.xiaoleilu.hutool.util.ObjectUtil;

@Service
public class RechargeService extends BaseRoncoo {

	private static final String NOTIFY_URL = ConfigUtil.GATEWAY_URL + "/recharge/notify/{supplyCode}";

	@Autowired
	private RechargeManager rechargeManager;

	@Autowired(required = false)
	private Map<String, RechargeFacade> facade;

	public Result<RechargeResponse> recharge(RechargeRequest rechargeRequest) {
		// 商品校验
		Result<Item> resultItem = rechargeManager.checkItem(rechargeRequest);
		if (!resultItem.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultItem.getCode(), resultItem.getMsg());
		}
		Item item = resultItem.getData();

		// 商户校验
		Result<MerchantInfo> resultMch = rechargeManager.checkMch(rechargeRequest.getAppId());
		if (!resultMch.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultMch.getCode(), resultMch.getMsg());
		}
		MerchantInfo merchantInfo = resultMch.getData();

		// 参数sign校验
		if (!SignUtil.checkSign(MapObjectUtil.Obj2Map(rechargeRequest), merchantInfo.getAppSeceret())) {
			return Result.error("sign不正确");
		}

		// 订单校验
		Result<OrderTrade> resultOrder = rechargeManager.checkOrder(rechargeRequest.getOrderNo(), merchantInfo.getUserInfoId());
		if (!resultOrder.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultOrder.getCode(), resultOrder.getMsg());
		}

		// 创建交易订单，返回带上订单ID
		OrderTrade orderTrade = rechargeManager.createOrderTrade(rechargeRequest.getMobile(), rechargeRequest.getOrderNo(), rechargeRequest.getOrderTime(), rechargeRequest.getNotifyUrl(), item, merchantInfo);

		// 支付
		Result<OrderTrade> resultPay = rechargeManager.pay(orderTrade);
		if (!resultPay.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			orderTrade.setSupplyDesc(resultPay.getMsg());
			rechargeManager.updateOrderTrade(orderTrade);
			return Result.error(resultPay.getCode(), resultPay.getMsg());
		}

		// 供货充值
		Result<OrderSupply> resultorderSupply = supplyRecharge(orderTrade);
		if (!resultorderSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			// 供货失败退款
			Result<OrderTrade> resultRefund = rechargeManager.refund(orderTrade);
			if (!resultRefund.getCode().equals(ResultEnum.SUCCESS.getCode())) {
				// 退款失败，订单会标记为没确认
				logger.error("充值业务-充值接口：退款异常，原因={}", resultRefund.getMsg());

				// 这里返回供货失败原因
				return Result.error(resultorderSupply.getMsg());
			}

			// 退款成功
			orderTrade.setSupplyDesc(resultorderSupply.getMsg());
			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			rechargeManager.updateOrderTrade(orderTrade);
			return Result.error(resultorderSupply.getCode(), resultorderSupply.getMsg());
		}

		return completeRechargeResponse(orderTrade);
	}

	/**
	 * 回调通知
	 */
	public Result<String> notify(String supplyCode, TreeMap<String, Object> paramMap) {
		// 接口校验
		if (ObjectUtil.isNull(facade)) {
			return Result.error("该接口没对应的供货商");
		}

		// 查找接口
		RechargeFacade rechargeFacade = facade.get(supplyCode);
		if (ObjectUtil.isNull(rechargeFacade)) {
			return Result.error("接口异常");
		}

		// 根据supplycode查找代理商
		Result<SupplyInfo> resultSupply = rechargeManager.getSupplyBySupplyCode(supplyCode);
		if (!resultSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultSupply.getCode(), resultSupply.getMsg());
		}
		SupplyInfo supplyInfo = resultSupply.getData();

		RechargeNotifyBO rechargeNotifyBO = new RechargeNotifyBO();
		BeanUtils.copyProperties(supplyInfo, rechargeNotifyBO);
		rechargeNotifyBO.setParamMap(paramMap);
		try {
			RechargeNotifyDTO resultNofity = rechargeFacade.verify(rechargeNotifyBO);
			if (resultNofity.getTradeStatusEnum().getCode().equals(TradeStatusEnum.UNCONFIRM.getCode())) {
				// 未确认
				return Result.success(resultNofity.getReturnMsg());
			}

			logger.warn("充值业务-充值接口：结果={}", resultNofity.getTradeStatusEnum());

			// 供货订单
			OrderSupply orderSupply = rechargeManager.getOrderSupplyBySupplySerialNo(resultNofity.getSupplySerialNo());
			if (null == orderSupply) {
				return Result.error("找不到供货订单");
			}

			if (!orderSupply.getOrderStatus().equals(OrderStatusEnum.WARTING.getCode())) {
				// 不是处理中的，都证明已经处理，防止重复处理，要进行幂等性处理
				logger.warn("该交易订单已经处理完成，无需再处理");
				return Result.success(resultNofity.getReturnMsg());
			}

			// 交易订单
			OrderTrade orderTrade = rechargeManager.getOrderTradeByTradeNo(orderSupply.getOrderTradeNo());
			if (null == orderTrade) {
				return Result.error("找不到交易订单");
			}

			if (resultNofity.getTradeStatusEnum().getCode().equals(TradeStatusEnum.SUCCESS.getCode())) {
				// 成功
				orderTrade.setOrderStatus(OrderStatusEnum.SUCCESS.getCode());
				orderTrade.setSupplyDesc(OrderStatusEnum.SUCCESS.getDesc());
				rechargeManager.updateOrderTrade(orderTrade);

				orderSupply.setOrderStatus(OrderStatusEnum.SUCCESS.getCode());
				orderSupply.setSupplyDesc(OrderStatusEnum.SUCCESS.getDesc());
				rechargeManager.updateOrderSupply(orderSupply);

				// 通知下游
			} else if (resultNofity.getTradeStatusEnum().getCode().equals(TradeStatusEnum.FAIL.getCode())) {
				// 供货订单失败处理
				orderSupply.setSupplyDesc(resultNofity.getErrorMsg());
				orderSupply.setOrderStatus(OrderStatusEnum.FAIL.getCode());
				rechargeManager.updateOrderSupply(orderSupply);

				// 继续供货
				Result<OrderSupply> resultorderSupply = supplyRecharge(orderTrade);
				if (!resultorderSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
					// 充值失败-退款
					Result<OrderTrade> resultRefund = rechargeManager.refund(orderTrade);
					if (!resultRefund.getCode().equals(ResultEnum.SUCCESS.getCode())) {
						// 退款失败，订单会标记为没确认，待人工处理
						logger.error("充值业务-充值接口：退款异常，原因={}", resultRefund.getMsg());

						// 这里返回供货失败原因
						return Result.error(resultorderSupply.getMsg());
					}

					// 退款成功
					orderTrade.setSupplyDesc(resultorderSupply.getMsg());
					orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
					rechargeManager.updateOrderTrade(orderTrade);

					// 通知下游
				} else {
					// 供货成功，不通知下游，继续等待回调，返回上游接口信息
					return Result.success(resultNofity.getReturnMsg());
				}
			} else {
				logger.warn("充值业务-充值接口：返回状态={}", resultNofity.getTradeStatusEnum().getDesc());
				return Result.error("订单状态为未确认");
			}

			// 消息处理，异步
			rechargeManager.notifyMch(orderTrade);

			return Result.success(resultNofity.getReturnMsg());
		} catch (Exception e) {
			logger.error("充值业务-充值接口：校验异常", e);
			return Result.error("校验异常");
		}
	}

	public Result<ExchangeOrderResponse> queryOrder(ExchangeOrderRequest exchangeOrderRequest) {
		// 商户校验
		Result<MerchantInfo> resultMch = rechargeManager.checkMch(exchangeOrderRequest.getAppId());
		if (!resultMch.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultMch.getCode(), resultMch.getMsg());
		}
		MerchantInfo merchantInfo = resultMch.getData();

		// 参数sign校验
		if (!SignUtil.checkSign(MapObjectUtil.Obj2Map(exchangeOrderRequest), merchantInfo.getAppSeceret())) {
			return Result.error("sign不正确");
		}

		OrderTrade orderTrade = rechargeManager.getOrderTradeByTradeNo(exchangeOrderRequest.getTradeNo());
		if (null == orderTrade) {
		}

		return completeExchangeOrderResponse(orderTrade);
	}

	public Result<OrderSupply> supplyRecharge(OrderTrade orderTrade) {
		// 接口校验
		if (ObjectUtil.isNull(facade)) {
			return Result.error("该接口没对应的供货商");
		}

		// 供货商查找
		Result<SupplyInfo> resultSupply = rechargeManager.getSupplyInfo(orderTrade);
		if (!resultSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			logger.warn("充值业务-找不到适合的供货商，原因={}", resultSupply.getMsg());
			return Result.error(resultSupply.getCode(), resultSupply.getMsg());
		}
		SupplyInfo supplyInfo = resultSupply.getData();

		// 查找接口
		RechargeFacade rechargeFacade = facade.get(supplyInfo.getSupplyCode());
		if (ObjectUtil.isNull(rechargeFacade)) {
			logger.warn("充值业务-接口异常：SupplyCode={}", supplyInfo.getSupplyCode());
			return Result.error("接口异常");
		}

		// 创建供货订单
		OrderSupply orderSupply = rechargeManager.createOrderSupply(orderTrade, supplyInfo);

		// 异步调用
		final long time1 = System.currentTimeMillis();
		try {
			rechargeExecutor.execute(new Runnable() {
				@Override
				public void run() {
					final Thread currentThread = Thread.currentThread();
					final String threadName = currentThread.getName();
					currentThread.setName(String.format(currentThread.getName() + "-供货线程(订单号:%d-供货单:%d-供货商品ID:%d-供货商ID:%s)", orderTrade.getTradeNo(), orderSupply.getSupplySerialNo(), orderSupply.getItemSupplyId(), orderSupply.getSupplyName()));
					final long time2 = System.currentTimeMillis();

					// 充值接口
					RechargeDTO rechargeDTO = rechargeFacade.recharge(createRechargeBO(orderTrade, supplyInfo));
					currentThread.setName(threadName);
					logger.warn("充值业务-充值接口：调用完成-总耗时={}ms，上游通信耗时={}ms ", System.currentTimeMillis() - time1, System.currentTimeMillis() - time2);

					if (null == rechargeDTO) {
						logger.warn("充值业务-充值接口：该接口没实现");
					} else {
						if (TradeStatusEnum.SUCCESS.getCode().equals(rechargeDTO.getTradeStatusEnum().getCode())) {
							// 成功状态，等待接口回调
							logger.warn("充值业务-充值接口：充值成功，等待接口回调");
						} else if (TradeStatusEnum.FAIL.getCode().equals(rechargeDTO.getTradeStatusEnum().getCode())) {
							// 直接返回失败，这时接口应该是出现明显错误，应该通知管理员进行处理

							// 更新供货订单信息
							orderSupply.setSupplyDesc(rechargeDTO.getErrorMsg());
							orderSupply.setOrderStatus(OrderStatusEnum.FAIL.getCode());
							rechargeManager.updateOrderSupply(orderSupply);

							// 继续进行充值操作
							supplyRecharge(orderTrade);
						} else {
							// 未确认状态，不作任何处理，等待定时任务自动处理，后面处理不成功，进行人工处理
							logger.warn("充值业务-充值接口：返回状态={}", rechargeDTO.getTradeStatusEnum());
						}
					}
				}
			});

			orderSupply.setOrderStatus(OrderStatusEnum.WARTING.getCode());
			rechargeManager.updateOrderSupply(orderSupply);

			orderTrade.setOrderStatus(OrderStatusEnum.WARTING.getCode());
			orderTrade.setSupplyDesc(OrderStatusEnum.WARTING.getDesc());
			rechargeManager.updateOrderTrade(orderTrade);

			return Result.success(orderSupply);
		} catch (RejectedExecutionException e) {
			logger.error("供货线程池达到限额", e);

			orderSupply.setSupplyDesc("供货线程池达到限额");
			orderSupply.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			rechargeManager.updateOrderSupply(orderSupply);
			return Result.error("供货交易繁忙");
		}
	}

	private Result<ExchangeOrderResponse> completeExchangeOrderResponse(OrderTrade orderTrade) {
		ExchangeOrderResponse resp = new ExchangeOrderResponse();
		resp.setTradeNo(orderTrade.getTradeNo());
		resp.setOrderNo(orderTrade.getOrderNo());
		resp.setProductNo(orderTrade.getItemNo());
		resp.setProductType(orderTrade.getItemType());
		resp.setMoblie(orderTrade.getMobile());
		resp.setFacePrice(orderTrade.getFacePrice());
		resp.setSalesPrice(orderTrade.getSalesPrice());
		return Result.success(resp);
	}

	private Result<RechargeResponse> completeRechargeResponse(OrderTrade orderTrade) {
		RechargeResponse resp = new RechargeResponse();
		resp.setMoblie(orderTrade.getMobile());
		resp.setOrderNo(orderTrade.getOrderNo());
		resp.setTradeNo(orderTrade.getTradeNo().toString());
		return Result.success(resp);
	}

	private RechargeBO createRechargeBO(OrderTrade orderTrade, SupplyInfo supplyInfo) {
		RechargeBO rechargeBO = new RechargeBO();
		BeanUtils.copyProperties(supplyInfo, rechargeBO);
		rechargeBO.setNotifyUrl(NOTIFY_URL.replace("{supplyCode}", supplyInfo.getSupplyCode())); // 回调地址的设置
		rechargeBO.setMobile(orderTrade.getMobile());
		rechargeBO.setAmount(orderTrade.getFacePrice());
		rechargeBO.setSupplySerialNo(orderTrade.getSupplySerialNo().toString());// 交易号
		return rechargeBO;
	}

}
