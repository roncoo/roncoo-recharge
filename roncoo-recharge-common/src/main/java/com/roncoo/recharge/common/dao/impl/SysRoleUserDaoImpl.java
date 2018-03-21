/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SysRoleUserDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysRoleUserMapper;
import com.roncoo.recharge.common.entity.SysRoleUser;
import com.roncoo.recharge.common.entity.SysRoleUserExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SysRoleUserDaoImpl implements SysRoleUserDao {
	@Autowired
	private SysRoleUserMapper sysRoleUserMapper;

	@Override
	public int save(SysRoleUser record) {
		return this.sysRoleUserMapper.insertSelective(record);
	}

	@Override
	public int deleteById(Long id) {
		return this.sysRoleUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(SysRoleUser record) {
		return this.sysRoleUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SysRoleUser getById(Long id) {
		return this.sysRoleUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<SysRoleUser> listForPage(int pageCurrent, int pageSize, SysRoleUserExample example) {
		int count = this.sysRoleUserMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<SysRoleUser>(count, totalPage, pageCurrent, pageSize, this.sysRoleUserMapper.selectByExample(example));
	}

	@Override
	public List<SysRoleUser> listByUserInfoId(Long userInfoId) {
		SysRoleUserExample example = new SysRoleUserExample();
		example.createCriteria().andUserInfoIdEqualTo(userInfoId);
		return this.sysRoleUserMapper.selectByExample(example);
	}

	@Override
	public int deleteByUserInfoId(Long userInfoId) {
		SysRoleUserExample example = new SysRoleUserExample();
		example.createCriteria().andUserInfoIdEqualTo(userInfoId);
		return this.sysRoleUserMapper.deleteByExample(example);
	}

	@Override
	public List<SysRoleUser> listByUserInfoIdAndPlatformId(Long userInfoId, Long platformId) {
		SysRoleUserExample example = new SysRoleUserExample();
		example.createCriteria().andUserInfoIdEqualTo(userInfoId).andPlatformIdEqualTo(platformId);
		return this.sysRoleUserMapper.selectByExample(example);
	}
}
