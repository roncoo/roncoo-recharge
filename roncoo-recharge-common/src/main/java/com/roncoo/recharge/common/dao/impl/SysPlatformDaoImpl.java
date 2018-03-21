/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.recharge.common.dao.SysPlatformDao;
import com.roncoo.recharge.common.dao.impl.mapper.SysPlatformMapper;
import com.roncoo.recharge.common.entity.SysPlatform;
import com.roncoo.recharge.common.entity.SysPlatformExample;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

@Repository
public class SysPlatformDaoImpl implements SysPlatformDao {
    @Autowired
    private SysPlatformMapper sysPlatformMapper;

    @Override
	public int save(SysPlatform record) {
        return this.sysPlatformMapper.insertSelective(record);
    }

    @Override
	public int deleteById(Long id) {
        return this.sysPlatformMapper.deleteByPrimaryKey(id);
    }

    @Override
	public int updateById(SysPlatform record) {
        return this.sysPlatformMapper.updateByPrimaryKeySelective(record);
    }

    @Override
	public SysPlatform getById(Long id) {
        return this.sysPlatformMapper.selectByPrimaryKey(id);
    }

    @Override
	public Page<SysPlatform> listForPage(int pageCurrent, int pageSize, SysPlatformExample example) {
        int count = this.sysPlatformMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<SysPlatform>(count, totalPage, pageCurrent, pageSize, this.sysPlatformMapper.selectByExample(example));
    }

	@Override
	public List<SysPlatform> listAll() {
		SysPlatformExample example = new SysPlatformExample();
		return this.sysPlatformMapper.selectByExample(example);
	}

	@Override
	public SysPlatform getByPlatformAppid(String platformAppid) {
		SysPlatformExample example = new SysPlatformExample();
		example.createCriteria().andPlatformAppIdEqualTo(platformAppid);
		List<SysPlatform> list = this.sysPlatformMapper.selectByExample(example);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
