/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SupplyInfoDao;
import com.roncoo.recharge.common.dao.impl.mapper.SupplyInfoMapper;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.common.entity.SupplyInfoExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SupplyInfoDaoImpl implements SupplyInfoDao {
	@Autowired
	private SupplyInfoMapper supplyInfoMapper;

	@Override
	public int save(SupplyInfo record) {
		return this.supplyInfoMapper.insertSelective(record);
	}

	@Override
	public int deleteById(Long id) {
		return this.supplyInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(SupplyInfo record) {
		return this.supplyInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SupplyInfo getById(Long id) {
		return this.supplyInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<SupplyInfo> listForPage(int pageCurrent, int pageSize, SupplyInfoExample example) {
		int count = this.supplyInfoMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<SupplyInfo>(count, totalPage, pageCurrent, pageSize, this.supplyInfoMapper.selectByExample(example));
	}

	@Override
	public List<SupplyInfo> listByStatusId(Integer statusId) {
		SupplyInfoExample example = new SupplyInfoExample();
		example.createCriteria().andStatusIdEqualTo(statusId);
		example.setOrderByClause(" id desc ");
		return this.supplyInfoMapper.selectByExample(example);
	}

	@Override
	public SupplyInfo getBySupplyCode(String supplyCode) {
		SupplyInfoExample example = new SupplyInfoExample();
		example.createCriteria().andSupplyCodeEqualTo(supplyCode);
		List<SupplyInfo> list = this.supplyInfoMapper.selectByExample(example);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
