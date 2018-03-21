/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.common.entity.SupplyInfoExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SupplyInfoDao {
    int save(SupplyInfo record);

    int deleteById(Long id);

    int updateById(SupplyInfo record);

    SupplyInfo getById(Long id);

    Page<SupplyInfo> listForPage(int pageCurrent, int pageSize, SupplyInfoExample example);

	List<SupplyInfo> listByStatusId(Integer statusId);

	SupplyInfo getBySupplyCode(String supplyCode);
}
