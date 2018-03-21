/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.SysMenuRole;
import com.roncoo.recharge.common.entity.SysMenuRoleExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SysMenuRoleDao {
    int save(SysMenuRole record);

    int deleteById(Long id);

    int updateById(SysMenuRole record);

    SysMenuRole getById(Long id);

    Page<SysMenuRole> listForPage(int pageCurrent, int pageSize, SysMenuRoleExample example);

	List<SysMenuRole> listByRoleId(Long roleId);

	int deleteByRoleId(Long roleId);
}
