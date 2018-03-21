/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.ItemSupply;
import com.roncoo.recharge.common.entity.ItemSupplyExample;
import com.roncoo.recharge.util.bjui.Page;

public interface ItemSupplyDao {
	int save(ItemSupply record);

	int deleteById(Long id);

	int updateById(ItemSupply record);

	ItemSupply getById(Long id);

	Page<ItemSupply> listForPage(int pageCurrent, int pageSize, ItemSupplyExample example);

	List<ItemSupply> listByItemId(Long itemId);
}
