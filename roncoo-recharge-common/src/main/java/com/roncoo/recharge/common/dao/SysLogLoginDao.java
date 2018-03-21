/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.SysLogLogin;
import com.roncoo.recharge.common.entity.SysLogLoginExample;
import com.roncoo.recharge.util.bjui.Page;

public interface SysLogLoginDao {
    int save(SysLogLogin record);

    int deleteById(Long id);

    int updateById(SysLogLogin record);

    SysLogLogin getById(Long id);

    Page<SysLogLogin> listForPage(int pageCurrent, int pageSize, SysLogLoginExample example);
}
