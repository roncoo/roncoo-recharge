/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.MerchantInfoExample;
import com.roncoo.recharge.util.bjui.Page;

public interface MerchantInfoDao {
    int save(MerchantInfo record);

    int deleteById(Long id);

    int updateById(MerchantInfo record);

    MerchantInfo getById(Long id);

    Page<MerchantInfo> listForPage(int pageCurrent, int pageSize, MerchantInfoExample example);

	MerchantInfo getByAppId(String appId);

	List<MerchantInfo> listAll();
}
