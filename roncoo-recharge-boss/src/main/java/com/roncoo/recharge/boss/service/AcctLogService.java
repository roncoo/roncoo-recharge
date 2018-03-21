/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.AcctLogQO;
import com.roncoo.recharge.boss.bean.vo.AcctLogVO;
import com.roncoo.recharge.common.dao.AcctLogDao;
import com.roncoo.recharge.common.entity.AcctLog;
import com.roncoo.recharge.common.entity.AcctLogExample;
import com.roncoo.recharge.common.entity.AcctLogExample.Criteria;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

/**
 * 账户日志
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class AcctLogService {

	@Autowired
	private AcctLogDao dao;

	public Page<AcctLogVO> listForPage(int pageCurrent, int pageSize, AcctLogQO qo) {
		AcctLogExample example = new AcctLogExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<AcctLog> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, AcctLogVO.class);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public AcctLogVO getById(Long id) {
		AcctLogVO vo = new AcctLogVO();
		AcctLog record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(AcctLogQO qo) {
		AcctLog record = new AcctLog();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

}
