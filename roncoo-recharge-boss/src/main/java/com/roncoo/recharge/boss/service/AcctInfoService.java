/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.AcctInfoQO;
import com.roncoo.recharge.boss.bean.vo.AcctInfoVO;
import com.roncoo.recharge.common.dao.AcctInfoDao;
import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.AcctInfoExample;
import com.roncoo.recharge.common.entity.AcctInfoExample.Criteria;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

/**
 * 账户信息
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class AcctInfoService {

	@Autowired
	private AcctInfoDao dao;

	public Page<AcctInfoVO> listForPage(int pageCurrent, int pageSize, AcctInfoQO qo) {
		AcctInfoExample example = new AcctInfoExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<AcctInfo> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, AcctInfoVO.class);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public AcctInfoVO getById(Long id) {
		AcctInfoVO vo = new AcctInfoVO();
		AcctInfo record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(AcctInfoQO qo) {
		AcctInfo record = new AcctInfo();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

}
