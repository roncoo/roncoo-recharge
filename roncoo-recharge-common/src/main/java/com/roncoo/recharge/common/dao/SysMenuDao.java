/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.SysMenu;
import com.roncoo.recharge.common.entity.SysMenuExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SysMenuDao {
	Long save(SysMenu record);

	int deleteById(Long id);

	int updateById(SysMenu record);

	SysMenu getById(Long id);

	Page<SysMenu> listForPage(int pageCurrent, int pageSize, SysMenuExample example);

	List<SysMenu> listByPlatformId(Long platformId);

	List<SysMenu> listByParentId(Long id);

	List<SysMenu> listByParentIdAndPlatformId(Long parentId, Long platformId);
}
