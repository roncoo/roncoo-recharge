/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.ItemDao;
import com.roncoo.recharge.common.dao.impl.mapper.ItemMapper;
import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.ItemExample;
import com.roncoo.recharge.common.entity.ItemExample.Criteria;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public int save(Item record) {
		record.setGmtCreate(new Date());
		record.setGmtModified(new Date());
		return this.itemMapper.insertSelective(record);
	}

	@Override
	public int deleteById(Long id) {
		return this.itemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(Item record) {
		record.setGmtModified(new Date());
		return this.itemMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Item getById(Long id) {
		return this.itemMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<Item> listForPage(int pageCurrent, int pageSize, ItemExample example) {
		int count = this.itemMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<Item>(count, totalPage, pageCurrent, pageSize, this.itemMapper.selectByExample(example));
	}

	@Override
	public List<Item> listByItemCategoryAndItemTypeAndFacePrice(Integer ItemCategory, Integer itemType, String facePrice) {
		ItemExample example = new ItemExample();
		Criteria c = example.createCriteria();
		c.andItemCategoryEqualTo(ItemCategory);
		c.andItemTypeEqualTo(itemType);
		c.andFacePriceEqualTo(facePrice);
		return this.itemMapper.selectByExample(example);
	}

	@Override
	public Item getByItemNo(String itemNo) {
		ItemExample example = new ItemExample();
		Criteria c = example.createCriteria();
		c.andItemNoEqualTo(itemNo);
		List<Item> list = this.itemMapper.selectByExample(example);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<Item> listByItemCategoryAndItemTypeAndProvinceCodeAndCarrierTypeAndFacePrice(Integer ItemCategory, Integer itemType, String provinceCode, Integer carrierType, String facePrice) {
		ItemExample example = new ItemExample();
		Criteria c = example.createCriteria();
		c.andItemCategoryEqualTo(ItemCategory);
		c.andItemTypeEqualTo(itemType);
		c.andSalesAreaEqualTo(provinceCode);
		c.andCarrierTypeEqualTo(carrierType);
		c.andFacePriceEqualTo(facePrice);
		return this.itemMapper.selectByExample(example);
	}

}
