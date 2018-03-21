/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.AreaInfoQO;
import com.roncoo.recharge.boss.bean.vo.AreaInfoVO;
import com.roncoo.recharge.common.dao.AreaInfoDao;
import com.roncoo.recharge.common.entity.AreaInfo;
import com.roncoo.recharge.common.entity.AreaInfoExample;
import com.roncoo.recharge.common.entity.AreaInfoExample.Criteria;
import com.roncoo.recharge.util.ArrayListUtil;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

/**
 * 
 *
 * @author wujing
 * @since 2017-12-30
 */
@Component
public class AreaInfoService {

	@Autowired
	private AreaInfoDao dao;

	public Page<AreaInfoVO> listForPage(int pageCurrent, int pageSize, AreaInfoQO qo) {
		AreaInfoExample example = new AreaInfoExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<AreaInfo> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, AreaInfoVO.class);
	}

	public int save(AreaInfoQO qo) {
		AreaInfo record = new AreaInfo();
		BeanUtils.copyProperties(qo, record);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public AreaInfoVO getById(Long id) {
		AreaInfoVO vo = new AreaInfoVO();
		AreaInfo record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(AreaInfoQO qo) {
		AreaInfo record = new AreaInfo();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

	public List<AreaInfoVO> listByProvince() {
		List<AreaInfo> list = dao.listByAreaType(1);
		return ArrayListUtil.copy(list, AreaInfoVO.class);
	}

}
