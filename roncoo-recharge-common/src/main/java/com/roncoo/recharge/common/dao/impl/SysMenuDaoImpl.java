/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SysMenuDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysMenuMapper;
import com.roncoo.recharge.common.entity.SysMenu;
import com.roncoo.recharge.common.entity.SysMenuExample;
import com.roncoo.recharge.util.base.AbstractBaseJdbc;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SysMenuDaoImpl extends AbstractBaseJdbc implements SysMenuDao {
	@Autowired
	private SysMenuMapper sysMenuMapper;

	@Override
	public Long save(SysMenu record) {
		this.sysMenuMapper.insertSelective(record);
		return getLastId();
	}

	@Override
	public int deleteById(Long id) {
		return this.sysMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateById(SysMenu record) {
		return this.sysMenuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SysMenu getById(Long id) {
		return this.sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<SysMenu> listForPage(int pageCurrent, int pageSize, SysMenuExample example) {
		int count = this.sysMenuMapper.countByExample(example);
		pageSize = PageUtil.checkPageSize(pageSize);
		pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
		int totalPage = PageUtil.countTotalPage(count, pageSize);
		example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
		example.setPageSize(pageSize);
		return new Page<SysMenu>(count, totalPage, pageCurrent, pageSize, this.sysMenuMapper.selectByExample(example));
	}

	@Override
	public List<SysMenu> listByPlatformId(Long platformId) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andPlatformIdEqualTo(platformId);
		example.setOrderByClause(" sort desc, id desc");
		return this.sysMenuMapper.selectByExample(example);
	}

	@Override
	public List<SysMenu> listByParentId(Long id) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andParentIdEqualTo(id);
		example.setOrderByClause(" sort desc, id desc");
		return this.sysMenuMapper.selectByExample(example);
	}

	@Override
	public List<SysMenu> listByParentIdAndPlatformId(Long parentId, Long platformId) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andParentIdEqualTo(parentId).andPlatformIdEqualTo(platformId);
		example.setOrderByClause(" sort desc, id desc");
		return this.sysMenuMapper.selectByExample(example);
	}
}
