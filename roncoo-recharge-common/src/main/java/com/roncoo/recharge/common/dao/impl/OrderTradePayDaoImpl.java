/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.roncoo.recharge.common.dao.OrderTradePayDao;
import com.roncoo.recharge.common.dao.impl.mapper.OrderTradePayMapper;
import com.roncoo.recharge.common.entity.OrderTradePay;
import com.roncoo.recharge.common.entity.OrderTradePayExample;
import com.roncoo.recharge.util.base.AbstractBaseJdbc;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class OrderTradePayDaoImpl extends AbstractBaseJdbc implements OrderTradePayDao {
	@Autowired
	private OrderTradePayMapper orderTradePayMapper;

	@Override
	@Transactional
	public Long save(OrderTradePay record) {
		record.setGmtCreate(new Date());
		record.setGmtModified(new Date());
		this.orderTradePayMapper.insertSelective(record);
		return getLastId();
	}

	@Override
	public int deleteById(Long id) {
		return this.orderTradePayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(OrderTradePay record) {
		record.setGmtModified(new Date());
		return this.orderTradePayMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public OrderTradePay getById(Long id) {
		return this.orderTradePayMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<OrderTradePay> listForPage(int pageCurrent, int pageSize, OrderTradePayExample example) {
		int count = this.orderTradePayMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<OrderTradePay>(count, totalPage, pageCurrent, pageSize, this.orderTradePayMapper.selectByExample(example));
	}
}
