/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao;

import com.roncoo.recharge.common.entity.AcctLog;
import com.roncoo.recharge.common.entity.AcctLogExample;
import com.roncoo.recharge.util.bjui.Page;

public interface AcctLogDao {
    Long save(AcctLog record);

    int deleteById(Long id);

    int updateById(AcctLog record);

    AcctLog getById(Long id);

    Page<AcctLog> listForPage(int pageCurrent, int pageSize, AcctLogExample example);
}
