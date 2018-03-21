/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.boss.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.gateway.service.ExchangeService;
import com.roncoo.recharge.gateway.service.RechargeService;
import com.roncoo.recharge.gateway.service.manager.ExchangeManager;
import com.roncoo.recharge.gateway.service.manager.RechargeManager;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.OrderStatusEnum;
import com.roncoo.recharge.util.enums.RepeatTypeEnum;
import com.roncoo.recharge.util.enums.ResultEnum;

@Service
public class BossRepairBiz extends BaseRoncoo {

	@Autowired
	private ExchangeService exchangeService;

	@Autowired
	private ExchangeManager exchangeManager;

	@Autowired
	private RechargeService rechargeService;

	@Autowired
	private RechargeManager rechargeManager;

	/**
	 * 补兑换接口
	 */
	public Result<OrderTrade> repairExchange(Long tradeNo) {
		OrderTrade orderTrade = exchangeManager.getOrderTradeByTradeNo(tradeNo);

		if (!OrderStatusEnum.FAIL.getCode().equals(orderTrade.getOrderStatus())) {
			// 不是失败的交易订单，不允许补充
			return Result.error("不是失败的交易订单，不允许补充");
		}

		orderTrade.setRepeatType(RepeatTypeEnum.YES.getCode());
		orderTrade.setSupplyIndex(0);
		Result<OrderSupply> resultorderSupply = exchangeService.supplyExchange(orderTrade);
		if (!resultorderSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			// 失败
			orderTrade.setSupplyDesc(resultorderSupply.getMsg());
			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			exchangeManager.updateOrderTrade(orderTrade);
			return Result.error(resultorderSupply.getCode(), resultorderSupply.getMsg());
		}

		return Result.success(orderTrade);
	}

	/**
	 * 补通知接口
	 */
	public Result<String> repairExchangeNotify(Long tradeNo) {
		OrderTrade orderTrade = exchangeManager.getOrderTradeByTradeNo(tradeNo);
		exchangeManager.notifyMch(orderTrade);
		return Result.success("通知成功");
	}

	/**
	 * 补充值接口
	 */
	public Result<OrderTrade> repairRecharge(Long tradeNo) {
		OrderTrade orderTrade = rechargeManager.getOrderTradeByTradeNo(tradeNo);

		if (!OrderStatusEnum.FAIL.getCode().equals(orderTrade.getOrderStatus())) {
			// 不是失败的交易订单，不允许补充
			return Result.error("不是失败的交易订单，不允许补充");
		}

		// 支付
		Result<OrderTrade> resultPay = rechargeManager.pay(orderTrade);
		if (!resultPay.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			orderTrade.setSupplyDesc(resultPay.getMsg());
			rechargeManager.updateOrderTrade(orderTrade);
			logger.warn("充值业务-补充供货失败：失败原因={}", resultPay.getMsg());
			return Result.error(resultPay.getCode(), resultPay.getMsg());
		}

		orderTrade.setRepeatType(RepeatTypeEnum.YES.getCode());
		orderTrade.setSupplyIndex(0);
		Result<OrderSupply> resultOrderSupply = rechargeService.supplyRecharge(orderTrade);
		if (!resultOrderSupply.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			logger.warn("充值业务-补充供货失败：失败原因={}", resultOrderSupply.getMsg());
			// 退款
			Result<OrderTrade> resultRefund = rechargeManager.refund(orderTrade);
			if (!resultRefund.getCode().equals(ResultEnum.SUCCESS.getCode())) {
				// 退款失败，订单会标记为没确认
				logger.error("流量充值业务-充值接口：退款异常，原因={}", resultRefund.getMsg());

				// 这里返回供货失败原因
				return Result.error(resultOrderSupply.getMsg());
			}

			// 退款成功
			orderTrade.setSupplyDesc(resultOrderSupply.getMsg());
			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			rechargeManager.updateOrderTrade(orderTrade);
			return Result.error(resultOrderSupply.getCode(), resultOrderSupply.getMsg());
		}

		return Result.success(orderTrade);
	}

	/**
	 * 补通知接口
	 */
	public Result<String> repairRechargeNotify(Long tradeNo) {
		OrderTrade orderTrade = rechargeManager.getOrderTradeByTradeNo(tradeNo);
		rechargeManager.notifyMch(orderTrade);
		return Result.success("通知成功");
	}

}
