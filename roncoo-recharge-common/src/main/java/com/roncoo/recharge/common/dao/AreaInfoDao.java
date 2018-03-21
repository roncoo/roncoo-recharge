/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.AreaInfo;
import com.roncoo.recharge.common.entity.AreaInfoExample;
import com.roncoo.recharge.util.bjui.Page;

public interface AreaInfoDao {
	int save(AreaInfo record);

	int deleteById(Long id);

	int updateById(AreaInfo record);

	AreaInfo getById(Long id);

	Page<AreaInfo> listForPage(int pageCurrent, int pageSize, AreaInfoExample example);

	AreaInfo getByProvinceCode(String provinceCode);

	AreaInfo getByProvinceAndCity(String provinceName, String cityName);

	List<AreaInfo> listByAreaType(int areaType);
}
