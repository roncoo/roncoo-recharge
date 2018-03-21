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

import com.roncoo.recharge.api.bo.ExchangeBO;
import com.roncoo.recharge.api.bo.ExchangeNotifyBO;
import com.roncoo.recharge.api.dto.ExchangeDTO;
import com.roncoo.recharge.api.dto.ExchangeNotifyDTO;
import com.roncoo.recharge.api.facade.ExchangeFacade;
import com.roncoo.recharge.api.request.ExchangeOrderRequest;
import com.roncoo.recharge.api.request.ExchangeRequest;
import com.roncoo.recharge.api.response.ExchangeOrderResponse;
import com.roncoo.recharge.api.response.ExchangeResponse;
import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.gateway.service.manager.ExchangeManager;
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
public class ExchangeService extends BaseRoncoo {

	private static final String NOTIFY_URL = ConfigUtil.GATEWAY_URL + "/exchange/notify/{supplyCode}";

	@Autowired
	private ExchangeManager exchangeManager;

	@Autowired(required = false)
	private Map<String, ExchangeFacade> facade;

	/**
	 * 兑换功能
	 */
	public Result<ExchangeResponse> exchange(ExchangeRequest exchangeRequest) {
		// 接口校验
		if (ObjectUtil.isNull(facade)) {
			return Result.error("该接口没对应的供货商");
		}

		Result<Item> resultItem = exchangeManager.checkItem(exchangeRequest.getAmount());
		if (!resultItem.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultItem.getCode(), resultItem.getMsg());
		}
		Item item = resultItem.getData();

		// 商户校验
		Result<MerchantInfo> resultMch = exchangeManager.checkMch(exchangeRequest.getAppId());
		if (!resultMch.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultMch.getCode(), resultMch.getMsg());
		}
		MerchantInfo merchantInfo = resultMch.getData();

		// 参数sign校验
		if (!SignUtil.checkSign(MapObjectUtil.Obj2Map(exchangeRequest), merchantInfo.getAppSeceret())) {
			return Result.error("sign不正确");
		}

		// 订单校验
		Result<OrderTrade> resultOrder = exchangeManager.checkOrder(exchangeRequest.getOrderNo(), merchantInfo.getUserInfoId());
		if (!resultOrder.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultOrder.getCode(), resultOrder.getMsg());
		}

		// 创建交易订单，返回带上订单ID
		OrderTrade orderTrade = exchangeManager.createOrderTrade(exchangeRequest, item, merchantInfo);

		// 供货兑换
		Result<OrderSupply> resultorderSupply = supplyExchange(orderTrade);
		if (!resultorderSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			// 失败
			orderTrade.setSupplyDesc(resultorderSupply.getMsg());
			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			exchangeManager.updateOrderTrade(orderTrade);
			return Result.error(resultorderSupply.getCode(), resultorderSupply.getMsg());
		}

		return completeExchangeResponse(orderTrade);
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
		ExchangeFacade exchangeFacade = facade.get(supplyCode);
		if (ObjectUtil.isNull(exchangeFacade)) {
			return Result.error("接口异常:supplyCode=" + supplyCode);
		}

		// 根据supplycode查找代理商
		Result<SupplyInfo> resultSupply = exchangeManager.getSupplyBySupplyCode(supplyCode);
		if (!resultSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultSupply.getCode(), resultSupply.getMsg());
		}
		SupplyInfo supplyInfo = resultSupply.getData();

		ExchangeNotifyBO exchangeNotifyBO = new ExchangeNotifyBO();
		BeanUtils.copyProperties(supplyInfo, exchangeNotifyBO);
		exchangeNotifyBO.setParamMap(paramMap);
		try {
			ExchangeNotifyDTO resultExchargeNofity = exchangeFacade.verify(exchangeNotifyBO);
			if (resultExchargeNofity.getTradeStatusEnum().getCode().equals(TradeStatusEnum.UNCONFIRM.getCode())) {
				// 未确认
				return Result.success(resultExchargeNofity.getReturnMsg());
			}

			// 供货订单
			OrderSupply orderSupply = exchangeManager.getOrderSupplyBySupplySerialNo(resultExchargeNofity.getSupplySerialNo());
			if (null == orderSupply) {
				return Result.error("找不到供货订单");
			}

			if (!orderSupply.getOrderStatus().equals(OrderStatusEnum.WARTING.getCode())) {
				// 不是处理中的，都证明已经处理，防止重复处理，要进行幂等性处理
				logger.warn("该交易订单已经处理完成，无需再处理");
				return Result.success(resultExchargeNofity.getReturnMsg());
			}

			// 交易订单
			OrderTrade orderTrade = exchangeManager.getOrderTradeByTradeNo(orderSupply.getOrderTradeNo());
			if (null == orderTrade) {
				return Result.error("找不到交易订单");
			}

			if (resultExchargeNofity.getTradeStatusEnum().getCode().equals(TradeStatusEnum.SUCCESS.getCode())) {
				// 成功
				exchangeManager.notifySuccess(orderSupply, orderTrade);

				// 通知下游
			} else if (resultExchargeNofity.getTradeStatusEnum().getCode().equals(TradeStatusEnum.FAIL.getCode())) {
				// 供货订单失败处理
				orderSupply.setSupplyDesc(resultExchargeNofity.getErrorMsg());
				orderSupply.setOrderStatus(OrderStatusEnum.FAIL.getCode());
				exchangeManager.updateOrderSupply(orderSupply);

				// 继续供货
				Result<OrderSupply> resultorderSupply = supplyExchange(orderTrade);
				if (!resultorderSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
					// 失败
					orderTrade.setSupplyDesc(resultExchargeNofity.getErrorMsg());
					orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
					exchangeManager.updateOrderTrade(orderTrade);

					// 通知下游
				} else {
					// 供货成功，不通知下游，继续等待回调，返回上游接口信息
					return Result.success(resultExchargeNofity.getReturnMsg());
				}
			} else {
				logger.warn("兑换业务-接口：返回状态为={}", resultExchargeNofity.getTradeStatusEnum().getDesc());
				return Result.error("订单状态为未确认");
			}

			// 消息处理，异步
			exchangeManager.notifyMch(orderTrade);

			return Result.success(resultExchargeNofity.getReturnMsg());
		} catch (Exception e) {
			logger.error("兑换业务：校验异常", e);
			return Result.error("校验异常");
		}
	}

	public Result<ExchangeOrderResponse> queryOrder(ExchangeOrderRequest exchangeOrderRequest) {
		// 商户校验
		Result<MerchantInfo> resultMch = exchangeManager.checkMch(exchangeOrderRequest.getAppId());
		if (!resultMch.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultMch.getCode(), resultMch.getMsg());
		}
		MerchantInfo merchantInfo = resultMch.getData();

		if (!SignUtil.checkSign(MapObjectUtil.Obj2Map(exchangeOrderRequest), merchantInfo.getAppSeceret())) {
			return Result.error("sign不正确");
		}

		//
		OrderTrade orderTrade = exchangeManager.getOrderTradeByTradeNo(exchangeOrderRequest.getTradeNo());

		return completeExchangeOrderResponse(orderTrade);
	}

	public Result<OrderSupply> supplyExchange(OrderTrade orderTrade) {
		// 供货商查找
		Result<SupplyInfo> resultSupply = exchangeManager.getSupplyInfo(orderTrade);
		if (!resultSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultSupply.getCode(), resultSupply.getMsg());
		}
		SupplyInfo supplyInfo = resultSupply.getData();

		// 查找接口
		ExchangeFacade exchangeFacade = facade.get(supplyInfo.getSupplyCode());
		if (ObjectUtil.isNull(exchangeFacade)) {
			return Result.error("接口异常:supplyCode=" + supplyInfo.getSupplyCode());
		}

		// 创建供货订单
		OrderSupply orderSupply = exchangeManager.createOrderSupply(orderTrade, supplyInfo);

		// 异步调用
		final long time1 = System.currentTimeMillis();
		try {
			exchangeExecutor.execute(new Runnable() {
				@Override
				public void run() {
					final Thread currentThread = Thread.currentThread();
					final String threadName = currentThread.getName();
					currentThread.setName(String.format(currentThread.getName() + "-供货线程:(订单号:%d-供货单:%d-供货商品ID:%d-供货商ID:%s)", orderTrade.getTradeNo(), orderSupply.getSupplySerialNo(), orderSupply.getItemSupplyId(), orderSupply.getSupplyName()));
					final long time2 = System.currentTimeMillis();
					ExchangeDTO exchangeDTO = exchangeFacade.exchange(createExchangeBO(orderTrade, supplyInfo)); // 兑换接口
					logger.warn(currentThread.getName());
					currentThread.setName(threadName);
					logger.warn("兑换业务-接口：调用完成-总耗时={}ms，上游通信耗时={}ms ", System.currentTimeMillis() - time1, System.currentTimeMillis() - time2);

					if (null == exchangeDTO) {
						logger.warn("兑换业务-充值接口：该接口没实现");
					} else {
						if (TradeStatusEnum.SUCCESS.getCode().equals(exchangeDTO.getTradeStatusEnum().getCode())) {
							// 成功状态，等待接口回调
							logger.warn("兑换业务-充值接口：兑换成功，等待接口回调");
						} else if (TradeStatusEnum.FAIL.getCode().equals(exchangeDTO.getTradeStatusEnum().getCode())) {
							// 失败状态，这时接口应该是出现明显错误，应该通知管理员进行处理

							// 更新供货订单信息
							orderSupply.setSupplyDesc(exchangeDTO.getErrorMsg());
							orderSupply.setOrderStatus(OrderStatusEnum.FAIL.getCode());
							exchangeManager.updateOrderSupply(orderSupply);

							// 继续进行充值操作
							supplyExchange(orderTrade);
						} else {
							// 未确认状态，不作任何处理，等待定时任务自动处理，后面处理不成功，进行人工处理
							logger.warn("兑换业务-接口：返回状态={}", exchangeDTO.getTradeStatusEnum().getDesc());
						}
					}
				}
			});

			orderSupply.setOrderStatus(OrderStatusEnum.WARTING.getCode());
			exchangeManager.updateOrderSupply(orderSupply);

			orderTrade.setOrderStatus(OrderStatusEnum.WARTING.getCode());
			orderTrade.setSupplyDesc(OrderStatusEnum.WARTING.getDesc());
			exchangeManager.updateOrderTrade(orderTrade);

			return Result.success(orderSupply);
		} catch (RejectedExecutionException e) {
			logger.error("供货线程池达到限额", e);
			orderSupply.setSupplyDesc("供货线程池达到限额");
			orderSupply.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			exchangeManager.updateOrderSupply(orderSupply);
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

	private Result<ExchangeResponse> completeExchangeResponse(OrderTrade orderTrade) {
		ExchangeResponse resp = new ExchangeResponse();
		resp.setAmount(orderTrade.getMobile());
		resp.setCardNo(orderTrade.getCardNo());
		resp.setOrderNo(orderTrade.getOrderNo());
		resp.setTradeNo(orderTrade.getTradeNo().toString());
		return Result.success(resp);
	}

	private ExchangeBO createExchangeBO(OrderTrade orderTrade, SupplyInfo supplyInfo) {
		ExchangeBO exchangeBO = new ExchangeBO();
		BeanUtils.copyProperties(supplyInfo, exchangeBO);
		exchangeBO.setNotifyUrl(NOTIFY_URL.replace("{supplyCode}", supplyInfo.getSupplyCode())); // 回调地址的设置
		exchangeBO.setAmount(orderTrade.getFacePrice());
		exchangeBO.setCardNo(orderTrade.getCardNo());
		exchangeBO.setCardPwd(orderTrade.getCardPwd());
		exchangeBO.setSupplySerialNo(orderTrade.getSupplySerialNo().toString());// 交易号
		return exchangeBO;
	}

}
