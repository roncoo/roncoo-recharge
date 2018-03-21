/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.AcctInfoExample;
import com.roncoo.recharge.util.bjui.Page;

public interface AcctInfoDao {
	Long save(AcctInfo record);

	int deleteById(Long id);

	int updateById(AcctInfo record);

	AcctInfo getById(Long id);

	Page<AcctInfo> listForPage(int pageCurrent, int pageSize, AcctInfoExample example);

	AcctInfo getByUserInfoId(Long userInfoId);

	AcctInfo getByIdForUpdate(Long acctInfoId);
}
