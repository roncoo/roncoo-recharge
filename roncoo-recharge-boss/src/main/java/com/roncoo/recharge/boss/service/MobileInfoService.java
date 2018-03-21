/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.MobileInfoQO;
import com.roncoo.recharge.boss.bean.vo.MobileInfoVO;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.common.dao.MobileInfoDao;
import com.roncoo.recharge.common.entity.MobileInfo;
import com.roncoo.recharge.common.entity.MobileInfoExample;
import com.roncoo.recharge.common.entity.MobileInfoExample.Criteria;

/**
 *  
 *
 * @author wujing
 * @since 2017-12-30
 */
@Component
public class MobileInfoService {

	@Autowired
	private MobileInfoDao dao;

	public Page<MobileInfoVO> listForPage(int pageCurrent, int pageSize, MobileInfoQO qo) {
	    MobileInfoExample example = new MobileInfoExample();
	    Criteria c = example.createCriteria();
	    example.setOrderByClause(" id desc ");
        Page<MobileInfo> page = dao.listForPage(pageCurrent, pageSize, example);
        return PageUtil.transform(page, MobileInfoVO.class);
	}

	public int save(MobileInfoQO qo) {
	    MobileInfo record = new MobileInfo();
        BeanUtils.copyProperties(qo, record);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public MobileInfoVO getById(Long id) {
	    MobileInfoVO vo = new MobileInfoVO();
	    MobileInfo record = dao.getById(id);
        BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(MobileInfoQO qo) {
	    MobileInfo record = new MobileInfo();
        BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}
	
}
