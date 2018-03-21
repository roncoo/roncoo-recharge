/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.ItemExample;
import com.roncoo.recharge.util.bjui.Page;

public interface ItemDao {
	int save(Item record);

	int deleteById(Long id);

	int updateById(Item record);

	Item getById(Long id);

	Page<Item> listForPage(int pageCurrent, int pageSize, ItemExample example);

	Item getByItemNo(String itemNo);

	List<Item> listByItemCategoryAndItemTypeAndFacePrice(Integer ItemCategory, Integer itemType, String facePrice);

	List<Item> listByItemCategoryAndItemTypeAndProvinceCodeAndCarrierTypeAndFacePrice(Integer ItemCategory, Integer itemType, String provinceCode, Integer carrierType, String facePrice);

}
