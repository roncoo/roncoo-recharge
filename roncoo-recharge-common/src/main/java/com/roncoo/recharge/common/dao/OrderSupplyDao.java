/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderSupplyExample;
import com.roncoo.recharge.util.bjui.Page;

public interface OrderSupplyDao {
	Long save(OrderSupply record);

    int deleteById(Long id);

    int updateById(OrderSupply record);

    OrderSupply getById(Long id);

    Page<OrderSupply> listForPage(int pageCurrent, int pageSize, OrderSupplyExample example);

	OrderSupply getBySupplySerialNo(Long supplySerialNo);
}
