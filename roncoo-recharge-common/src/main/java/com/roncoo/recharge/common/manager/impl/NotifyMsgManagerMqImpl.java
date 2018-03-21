/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.manager.impl;

import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.manager.NotifyMsgManager;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.enums.ItemCategoryEnum;

/**
 * mq消息处理
 */
@Component
public class NotifyMsgManagerMqImpl extends BaseRoncoo implements NotifyMsgManager {

	@Override
	public void notifyMsg(OrderTrade orderTrade) {
		TreeMap<String, Object> map = new TreeMap<>();
		map.put("tradeNo", orderTrade.getTradeNo());
		map.put("orderNo", orderTrade.getOrderNo());
		map.put("orderStatus", orderTrade.getOrderStatus());
		map.put("amont", orderTrade.getFacePrice());
		if (ItemCategoryEnum.EXCHANGE.getCode().equals(orderTrade.getItemCategory())) {
			// 兑换通知
			map.put("cardNo", orderTrade.getCardNo());
		} else if (ItemCategoryEnum.RECHARGE.getCode().equals(orderTrade.getItemCategory())) {
			// 充值通知
			map.put("mobile", orderTrade.getMobile());
		} else {
			logger.warn("未知商品类型={}", orderTrade.getItemCategory());
			return;
		}
		/*String result = HttpRestUtil.postForObject(orderTrade.getNotifyUrl(), map, String.class);
		logger.warn("通知下游：url={},参数={},返回={}", orderTrade.getNotifyUrl(), map, result);
		if (!"success".equalsIgnoreCase(result)) {
			// 失败，继续重复通知
			try {
				Thread.sleep(10000L);
			} catch (InterruptedException e) {
				logger.error("线程出错", e.getMessage());
			}
			result = HttpRestUtil.postForObject(orderTrade.getNotifyUrl(), map, String.class);
		}*/

	}

}
