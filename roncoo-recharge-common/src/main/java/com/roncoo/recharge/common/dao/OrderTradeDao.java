/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.OrderTradeExample;
import com.roncoo.recharge.util.bjui.Page;

public interface OrderTradeDao {
	Long save(OrderTrade record);

	int deleteById(Long id);

	int updateById(OrderTrade record);

	OrderTrade getById(Long id);

	Page<OrderTrade> listForPage(int pageCurrent, int pageSize, OrderTradeExample example);

	OrderTrade getByOrderNoAndUserInfoId(String orderNo, Long userInfoId);

	OrderTrade getByTradeNo(Long tradeNo);
}
