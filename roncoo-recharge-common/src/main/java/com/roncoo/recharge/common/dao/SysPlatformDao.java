/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import java.util.List;

import com.roncoo.recharge.common.entity.SysPlatform;
import com.roncoo.recharge.common.entity.SysPlatformExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SysPlatformDao {
    int save(SysPlatform record);

    int deleteById(Long id);

    int updateById(SysPlatform record);

    SysPlatform getById(Long id);

    Page<SysPlatform> listForPage(int pageCurrent, int pageSize, SysPlatformExample example);

	List<SysPlatform> listAll();

	SysPlatform getByPlatformAppid(String platformAppid);
}
