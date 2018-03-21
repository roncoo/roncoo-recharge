/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.OrderSupplyDao;
import com.roncoo.recharge.common.dao.impl.mapper.OrderSupplyMapper;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderSupplyExample;
import com.roncoo.recharge.util.base.AbstractBaseJdbc;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class OrderSupplyDaoImpl extends AbstractBaseJdbc implements OrderSupplyDao {
	@Autowired
	private OrderSupplyMapper orderSupplyMapper;

	@Override
	public Long save(OrderSupply record) {
		record.setGmtCreate(new Date());
		record.setGmtModified(new Date());
		this.orderSupplyMapper.insertSelective(record);
		return getLastId();
	}

	@Override
	public int deleteById(Long id) {
		return this.orderSupplyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(OrderSupply record) {
		record.setGmtModified(new Date());
		return this.orderSupplyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public OrderSupply getById(Long id) {
		return this.orderSupplyMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<OrderSupply> listForPage(int pageCurrent, int pageSize, OrderSupplyExample example) {
		int count = this.orderSupplyMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<OrderSupply>(count, totalPage, pageCurrent, pageSize, this.orderSupplyMapper.selectByExample(example));
	}

	@Override
	public OrderSupply getBySupplySerialNo(Long supplySerialNo) {
		OrderSupplyExample example = new OrderSupplyExample();
		example.createCriteria().andSupplySerialNoEqualTo(supplySerialNo);
		List<OrderSupply> list = this.orderSupplyMapper.selectByExample(example);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
