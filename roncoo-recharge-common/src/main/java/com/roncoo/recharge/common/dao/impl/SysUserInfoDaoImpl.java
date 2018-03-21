/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SysUserInfoDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysUserInfoMapper;
import com.roncoo.recharge.common.entity.SysUserInfo;
import com.roncoo.recharge.common.entity.SysUserInfoExample;
import com.roncoo.recharge.util.base.AbstractBaseJdbc;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SysUserInfoDaoImpl extends AbstractBaseJdbc implements SysUserInfoDao {
	@Autowired
	private SysUserInfoMapper sysUserInfoMapper;

	@Override
	public Long save(SysUserInfo record) {
		this.sysUserInfoMapper.insertSelective(record);
		return getLastId();
	}

	@Override
	public int deleteById(Long id) {
		return this.sysUserInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(SysUserInfo record) {
		return this.sysUserInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SysUserInfo getById(Long id) {
		return this.sysUserInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<SysUserInfo> listForPage(int pageCurrent, int pageSize, SysUserInfoExample example) {
		int count = this.sysUserInfoMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<SysUserInfo>(count, totalPage, pageCurrent, pageSize, this.sysUserInfoMapper.selectByExample(example));
	}

	@Override
	public SysUserInfo getByLoginName(String username) {
		SysUserInfoExample example = new SysUserInfoExample();
		example.createCriteria().andLoginNameEqualTo(username);
		List<SysUserInfo> list = this.sysUserInfoMapper.selectByExample(example);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
