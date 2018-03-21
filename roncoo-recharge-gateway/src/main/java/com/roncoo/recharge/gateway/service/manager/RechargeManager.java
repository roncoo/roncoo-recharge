/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.service.manager;

import com.roncoo.recharge.api.request.RechargeRequest;
import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.util.base.Result;

public interface RechargeManager {

	/**
	 * 校验商品
	 */
	Result<Item> checkItem(RechargeRequest rechargeRequest);

	/**
	 * 校验下游商户
	 */
	Result<MerchantInfo> checkMch(String appId);

	/**
	 * 校验订单号是否存在
	 */
	Result<OrderTrade> checkOrder(String orderNo, Long userInfoId);

	/**
	 * 获取供货商信息
	 */
	Result<SupplyInfo> getSupplyInfo(OrderTrade orderTrade);

	/**
	 * 创建交易订单
	 */
	OrderTrade createOrderTrade(String mobile, String orderNo, String orderTime, String notifyUrl, Item item, MerchantInfo merchantInfo);

	/**
	 * 创建供货订单
	 */
	OrderSupply createOrderSupply(OrderTrade orderTrade, SupplyInfo supplyInfo);

	/**
	 * 支付
	 */
	Result<OrderTrade> pay(OrderTrade orderTrade);

	/**
	 * 获取供货商信息
	 */
	Result<SupplyInfo> getSupplyBySupplyCode(String supplyCode);

	/**
	 * 获取交易订单
	 */
	OrderTrade getOrderTradeByTradeNo(Long tradeNo);

	/**
	 * 获取供货订单
	 */
	OrderSupply getOrderSupplyBySupplySerialNo(Long supplySerialNo);

	/**
	 * 更新交易订单
	 */
	void updateOrderTrade(OrderTrade orderTrade);

	/**
	 * 更新供货订单
	 */
	void updateOrderSupply(OrderSupply orderSupply);

	/**
	 * 退款
	 */
	Result<OrderTrade> refund(OrderTrade orderTrade);

	/**
	 * 通知
	 */
	void notifyMch(OrderTrade orderTrade);

}
