/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import com.roncoo.recharge.common.dao.SysLogOptDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysLogOptMapper;
import com.roncoo.recharge.common.entity.SysLogOpt;
import com.roncoo.recharge.common.entity.SysLogOptExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysLogOptDaoImpl implements SysLogOptDao {
    @Autowired
    private SysLogOptMapper sysLogOptMapper;

    public int save(SysLogOpt record) {
        return this.sysLogOptMapper.insertSelective(record);
    }

    public int deleteById(Long id) {
        return this.sysLogOptMapper.deleteByPrimaryKey(id);
    }

    public int updateById(SysLogOpt record) {
        return this.sysLogOptMapper.updateByPrimaryKeySelective(record);
    }

    public SysLogOpt getById(Long id) {
        return this.sysLogOptMapper.selectByPrimaryKey(id);
    }

    public Page<SysLogOpt> listForPage(int pageCurrent, int pageSize, SysLogOptExample example) {
        int count = this.sysLogOptMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<SysLogOpt>(count, totalPage, pageCurrent, pageSize, this.sysLogOptMapper.selectByExample(example));
    }
}
