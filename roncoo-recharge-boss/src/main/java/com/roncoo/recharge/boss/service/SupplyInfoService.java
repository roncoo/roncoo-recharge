/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.SupplyInfoQO;
import com.roncoo.recharge.boss.bean.vo.SupplyInfoVO;
import com.roncoo.recharge.common.dao.SupplyInfoDao;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.common.entity.SupplyInfoExample;
import com.roncoo.recharge.common.entity.SupplyInfoExample.Criteria;
import com.roncoo.recharge.util.ArrayListUtil;
import com.roncoo.recharge.util.ConfigUtil;
import com.roncoo.recharge.util.HttpRestUtil;
import com.roncoo.recharge.util.PingyinUtil;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.util.enums.StatusIdEnum;

/**
 * 商户信息
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class SupplyInfoService {

	@Autowired
	private SupplyInfoDao dao;

	public Page<SupplyInfoVO> listForPage(int pageCurrent, int pageSize, SupplyInfoQO qo) {
		SupplyInfoExample example = new SupplyInfoExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<SupplyInfo> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, SupplyInfoVO.class);
	}

	public int save(SupplyInfoQO qo) {
		SupplyInfo record = new SupplyInfo();
		BeanUtils.copyProperties(qo, record);
		record.setSupplyCode(PingyinUtil.toPingyin(qo.getSupplyName()));
		record.setStatusId(StatusIdEnum.NORMAL.getCode());
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public SupplyInfoVO getById(Long id) {
		SupplyInfoVO vo = new SupplyInfoVO();
		SupplyInfo record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(SupplyInfoQO qo) {
		SupplyInfo record = new SupplyInfo();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

	public List<SupplyInfoVO> listAll() {
		List<SupplyInfo> list = dao.listByStatusId(StatusIdEnum.NORMAL.getCode());
		return ArrayListUtil.copy(list, SupplyInfoVO.class);
	}

	public Page<SupplyInfoVO> lookup(int pageCurrent, int pageSize, SupplyInfoQO qo) {
		SupplyInfoExample example = new SupplyInfoExample();
		Criteria c = example.createCriteria();
		c.andStatusIdEqualTo(StatusIdEnum.NORMAL.getCode());
		example.setOrderByClause(" id desc ");
		Page<SupplyInfo> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, SupplyInfoVO.class);
	}

	@SuppressWarnings("rawtypes")
	public Result<HashMap> balance(String supplyCode) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("supplyCode", supplyCode);
		return HttpRestUtil.getForResultObject(ConfigUtil.BALANCE_QUERY_URL, map, HashMap.class);
	}

}
