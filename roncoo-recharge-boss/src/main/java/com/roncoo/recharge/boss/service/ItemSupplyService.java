/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.ItemSupplyQO;
import com.roncoo.recharge.boss.bean.vo.ItemSupplyVO;
import com.roncoo.recharge.common.dao.ItemSupplyDao;
import com.roncoo.recharge.common.entity.ItemSupply;
import com.roncoo.recharge.common.entity.ItemSupplyExample;
import com.roncoo.recharge.common.entity.ItemSupplyExample.Criteria;
import com.roncoo.recharge.util.BigDecimalUtils;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.xiaoleilu.hutool.util.ObjectUtil;

/**
 * 供应商商品管理
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class ItemSupplyService {

	@Autowired
	private ItemSupplyDao dao;

	public Page<ItemSupplyVO> listForPage(int pageCurrent, int pageSize, ItemSupplyQO qo) {
		ItemSupplyExample example = new ItemSupplyExample();
		Criteria c = example.createCriteria();
		if (ObjectUtil.isNotNull(qo.getItemId())) {
			c.andItemIdEqualTo(qo.getItemId());
		}
		example.setOrderByClause(" item_status asc, id desc ");
		Page<ItemSupply> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, ItemSupplyVO.class);
	}

	public int save(ItemSupplyQO qo) {
		ItemSupply record = new ItemSupply();
		BeanUtils.copyProperties(qo, record);
		record.setFacePrice(qo.getFacePrice());
		record.setCostPrice(BigDecimalUtils.integerMultiply(qo.getCostPrice()));
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public ItemSupplyVO getById(Long id) {
		ItemSupplyVO vo = new ItemSupplyVO();
		ItemSupply record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(ItemSupplyQO qo) {
		ItemSupply record = new ItemSupply();
		BeanUtils.copyProperties(qo, record);
		if (ObjectUtil.isNotNull(qo.getCostPrice())) {
			record.setCostPrice(BigDecimalUtils.integerMultiply(qo.getCostPrice()));
		}
		return dao.updateById(record);
	}

	public int statusById(ItemSupplyQO qo) {
		ItemSupply record = new ItemSupply();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

}
