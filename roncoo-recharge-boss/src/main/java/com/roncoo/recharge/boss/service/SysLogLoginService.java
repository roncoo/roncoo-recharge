/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.SysLogLoginQO;
import com.roncoo.recharge.boss.bean.vo.SysLogLoginVO;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.common.dao.SysLogLoginDao;
import com.roncoo.recharge.common.entity.SysLogLogin;
import com.roncoo.recharge.common.entity.SysLogLoginExample;
import com.roncoo.recharge.common.entity.SysLogLoginExample.Criteria;

/**
 * 用户登陆日志 
 *
 * @author wujing
 * @since 2017-12-26
 */
@Component
public class SysLogLoginService {

	@Autowired
	private SysLogLoginDao dao;

	public Page<SysLogLoginVO> listForPage(int pageCurrent, int pageSize, SysLogLoginQO qo) {
	    SysLogLoginExample example = new SysLogLoginExample();
	    Criteria c = example.createCriteria();
	    example.setOrderByClause(" id desc ");
        Page<SysLogLogin> page = dao.listForPage(pageCurrent, pageSize, example);
        return PageUtil.transform(page, SysLogLoginVO.class);
	}

	public int save(SysLogLoginQO qo) {
	    SysLogLogin record = new SysLogLogin();
        BeanUtils.copyProperties(qo, record);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public SysLogLoginVO getById(Long id) {
	    SysLogLoginVO vo = new SysLogLoginVO();
	    SysLogLogin record = dao.getById(id);
        BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(SysLogLoginQO qo) {
	    SysLogLogin record = new SysLogLogin();
        BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}
	
}
