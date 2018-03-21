/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.SysLogOpt;
import com.roncoo.recharge.common.entity.SysLogOptExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SysLogOptDao {
    int save(SysLogOpt record);

    int deleteById(Long id);

    int updateById(SysLogOpt record);

    SysLogOpt getById(Long id);

    Page<SysLogOpt> listForPage(int pageCurrent, int pageSize, SysLogOptExample example);
}
