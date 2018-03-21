/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import com.roncoo.recharge.common.dao.SysLogLoginDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysLogLoginMapper;
import com.roncoo.recharge.common.entity.SysLogLogin;
import com.roncoo.recharge.common.entity.SysLogLoginExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysLogLoginDaoImpl implements SysLogLoginDao {
    @Autowired
    private SysLogLoginMapper sysLogLoginMapper;

    public int save(SysLogLogin record) {
        return this.sysLogLoginMapper.insertSelective(record);
    }

    public int deleteById(Long id) {
        return this.sysLogLoginMapper.deleteByPrimaryKey(id);
    }

    public int updateById(SysLogLogin record) {
        return this.sysLogLoginMapper.updateByPrimaryKeySelective(record);
    }

    public SysLogLogin getById(Long id) {
        return this.sysLogLoginMapper.selectByPrimaryKey(id);
    }

    public Page<SysLogLogin> listForPage(int pageCurrent, int pageSize, SysLogLoginExample example) {
        int count = this.sysLogLoginMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<SysLogLogin>(count, totalPage, pageCurrent, pageSize, this.sysLogLoginMapper.selectByExample(example));
    }
}
