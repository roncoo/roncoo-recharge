/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.OrderTradePay;
import com.roncoo.recharge.common.entity.OrderTradePayExample;
import com.roncoo.recharge.util.bjui.Page;

public interface OrderTradePayDao {
    Long save(OrderTradePay record);

    int deleteById(Long id);

    int updateById(OrderTradePay record);

    OrderTradePay getById(Long id);

    Page<OrderTradePay> listForPage(int pageCurrent, int pageSize, OrderTradePayExample example);
}
