/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SysMenuRoleDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysMenuRoleMapper;
import com.roncoo.recharge.common.entity.SysMenuRole;
import com.roncoo.recharge.common.entity.SysMenuRoleExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SysMenuRoleDaoImpl implements SysMenuRoleDao {
    @Autowired
    private SysMenuRoleMapper sysMenuRoleMapper;

    @Override
	public int save(SysMenuRole record) {
        return this.sysMenuRoleMapper.insertSelective(record);
    }

    @Override
	public int deleteById(Long id) {
        return this.sysMenuRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
	public int updateById(SysMenuRole record) {
        return this.sysMenuRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
	public SysMenuRole getById(Long id) {
        return this.sysMenuRoleMapper.selectByPrimaryKey(id);
    }

    @Override
	public Page<SysMenuRole> listForPage(int pageCurrent, int pageSize, SysMenuRoleExample example) {
        int count = this.sysMenuRoleMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<SysMenuRole>(count, totalPage, pageCurrent, pageSize, this.sysMenuRoleMapper.selectByExample(example));
    }

	@Override
	public List<SysMenuRole> listByRoleId(Long roleId) {
		SysMenuRoleExample example = new SysMenuRoleExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		return this.sysMenuRoleMapper.selectByExample(example);
	}

	@Override
	public int deleteByRoleId(Long roleId) {
		SysMenuRoleExample example = new SysMenuRoleExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		return this.sysMenuRoleMapper.deleteByExample(example);
	}
}
