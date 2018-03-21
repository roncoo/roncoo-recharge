/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.SysLogOptQO;
import com.roncoo.recharge.boss.bean.vo.SysLogOptVO;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.common.dao.SysLogOptDao;
import com.roncoo.recharge.common.entity.SysLogOpt;
import com.roncoo.recharge.common.entity.SysLogOptExample;
import com.roncoo.recharge.common.entity.SysLogOptExample.Criteria;

/**
 * 用户操作日志表 
 *
 * @author wujing
 * @since 2017-12-26
 */
@Component
public class SysLogOptService {

	@Autowired
	private SysLogOptDao dao;

	public Page<SysLogOptVO> listForPage(int pageCurrent, int pageSize, SysLogOptQO qo) {
	    SysLogOptExample example = new SysLogOptExample();
	    Criteria c = example.createCriteria();
	    example.setOrderByClause(" id desc ");
        Page<SysLogOpt> page = dao.listForPage(pageCurrent, pageSize, example);
        return PageUtil.transform(page, SysLogOptVO.class);
	}

	public int save(SysLogOptQO qo) {
	    SysLogOpt record = new SysLogOpt();
        BeanUtils.copyProperties(qo, record);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public SysLogOptVO getById(Long id) {
	    SysLogOptVO vo = new SysLogOptVO();
	    SysLogOpt record = dao.getById(id);
        BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(SysLogOptQO qo) {
	    SysLogOpt record = new SysLogOpt();
        BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}
	
}
