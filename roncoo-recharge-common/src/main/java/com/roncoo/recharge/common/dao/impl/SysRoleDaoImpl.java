/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SysRoleDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysRoleMapper;
import com.roncoo.recharge.common.entity.SysRole;
import com.roncoo.recharge.common.entity.SysRoleExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SysRoleDaoImpl implements SysRoleDao {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
	public int save(SysRole record) {
        return this.sysRoleMapper.insertSelective(record);
    }

    @Override
	public int deleteById(Long id) {
        return this.sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
	public int updateById(SysRole record) {
        return this.sysRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
	public SysRole getById(Long id) {
        return this.sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
	public Page<SysRole> listForPage(int pageCurrent, int pageSize, SysRoleExample example) {
        int count = this.sysRoleMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<SysRole>(count, totalPage, pageCurrent, pageSize, this.sysRoleMapper.selectByExample(example));
    }

	@Override
	public List<SysRole> listByExample(SysRoleExample example) {
		return this.sysRoleMapper.selectByExample(example);
	}
}
