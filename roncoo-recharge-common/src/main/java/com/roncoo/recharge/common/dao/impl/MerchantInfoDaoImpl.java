/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.MerchantInfoDao;
import com.roncoo.recharge.common.dao.impl.mapper.MerchantInfoMapper;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.MerchantInfoExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class MerchantInfoDaoImpl implements MerchantInfoDao {
	@Autowired
	private MerchantInfoMapper merchantInfoMapper;

	@Override
	public int save(MerchantInfo record) {
		record.setGmtCreate(new Date());
    	record.setGmtModified(new Date());
		return this.merchantInfoMapper.insertSelective(record);
	}

	@Override
	public int deleteById(Long id) {
		return this.merchantInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(MerchantInfo record) {
		return this.merchantInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public MerchantInfo getById(Long id) {
		return this.merchantInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<MerchantInfo> listForPage(int pageCurrent, int pageSize, MerchantInfoExample example) {
		int count = this.merchantInfoMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<MerchantInfo>(count, totalPage, pageCurrent, pageSize, this.merchantInfoMapper.selectByExample(example));
	}

	@Override
	public MerchantInfo getByAppId(String appId) {
		MerchantInfoExample example = new MerchantInfoExample();
		example.createCriteria().andAppIdEqualTo(appId);
		List<MerchantInfo> list = this.merchantInfoMapper.selectByExample(example);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<MerchantInfo> listAll() {
		MerchantInfoExample example = new MerchantInfoExample();
		example.setOrderByClause(" id desc ");
		return this.merchantInfoMapper.selectByExample(example);
	}
}
