/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.MobileInfo;
import com.roncoo.recharge.common.entity.MobileInfoExample;
import com.roncoo.recharge.util.bjui.Page;

public interface MobileInfoDao {
    int save(MobileInfo record);

    int deleteById(Long id);

    int updateById(MobileInfo record);

    MobileInfo getById(Long id);

    Page<MobileInfo> listForPage(int pageCurrent, int pageSize, MobileInfoExample example);

	MobileInfo getByMobilePrefix(String mobilePrefix);
}
