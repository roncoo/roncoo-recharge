/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.SysUserInfo;
import com.roncoo.recharge.common.entity.SysUserInfoExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SysUserInfoDao {
	Long save(SysUserInfo record);

	int deleteById(Long id);

	int updateById(SysUserInfo record);

	SysUserInfo getById(Long id);

	Page<SysUserInfo> listForPage(int pageCurrent, int pageSize, SysUserInfoExample example);

	SysUserInfo getByLoginName(String username);
}
