/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.ItemQO;
import com.roncoo.recharge.boss.bean.vo.ItemVO;
import com.roncoo.recharge.common.dao.AreaInfoDao;
import com.roncoo.recharge.common.dao.ItemDao;
import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.ItemExample;
import com.roncoo.recharge.common.entity.ItemExample.Criteria;
import com.roncoo.recharge.util.BigDecimalUtils;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.util.enums.CarrierTypeEnum;
import com.roncoo.recharge.util.enums.FlowPackageTypeEnum;
import com.roncoo.recharge.util.enums.FlowScopeEnum;
import com.roncoo.recharge.util.enums.FlowStreamTypeEnum;
import com.roncoo.recharge.util.enums.ItemStatusEnum;
import com.roncoo.recharge.util.enums.ItemTypeEnum;
import com.roncoo.recharge.util.exception.BaseException;
import com.xiaoleilu.hutool.util.ReUtil;

/**
 * 商品管理
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class ItemService {

	@Autowired
	private ItemDao dao;
	@Autowired
	private AreaInfoDao areaInfoDao;

	public Page<ItemVO> listForPage(int pageCurrent, int pageSize, ItemQO qo) {
		ItemExample example = new ItemExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<Item> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, ItemVO.class);
	}

	public int save(ItemQO qo) {
		Item record = new Item();
		BeanUtils.copyProperties(qo, record);
		// 商品编码=商品类型+运营商类型+销售地区+面值
		record.setItemNo(getItemNo(qo));
		record.setItemName(areaInfoDao.getByProvinceCode(qo.getSalesArea()).getProvinceName() + CarrierTypeEnum.getDesc(qo.getCarrierType()) + qo.getFacePrice() + ItemTypeEnum.getDesc(qo.getItemType()) + FlowScopeEnum.getDesc(qo.getFlowScope()) + FlowPackageTypeEnum.getDesc(qo.getFlowPackageType()) + FlowStreamTypeEnum.getDesc(qo.getFlowStreamType()));
		record.setCostPrice(BigDecimalUtils.integerMultiply(qo.getCostPrice()));
		record.setSalesPrice1(BigDecimalUtils.integerMultiply(qo.getSalesPrice1()));
		record.setSalesPrice2(BigDecimalUtils.integerMultiply(qo.getSalesPrice2()));
		record.setSalesPrice3(BigDecimalUtils.integerMultiply(qo.getSalesPrice3()));
		if (record.getSalesPrice1() < record.getSalesPrice2()) {
			throw new BaseException("销售价1不能低于销售价2");
		}
		if (record.getSalesPrice2() < record.getSalesPrice3()) {
			throw new BaseException("销售价2不能低于销售价3");
		}
		if (record.getSalesPrice3() < record.getCostPrice()) {
			throw new BaseException("销售价3不能低于成本价");
		}

		record.setItemStatus(ItemStatusEnum.INIT.getCode());
		return dao.save(record);
	}

	private String getItemNo(ItemQO qo) {
		if (qo.getFlowScope() == null) {
			qo.setFlowScope(0);
		}
		if (qo.getFlowPackageType() == null) {
			qo.setFlowPackageType(0);
		}
		if (qo.getFlowStreamType() == null) {
			qo.setFlowStreamType(0);
		}
		return qo.getItemType().toString() + qo.getCarrierType().toString() + qo.getSalesArea().toString() + ReUtil.getFirstNumber(qo.getFacePrice()).toString() + qo.getFlowScope().toString() + qo.getFlowPackageType().toString() + qo.getFlowStreamType().toString();
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public ItemVO getById(Long id) {
		ItemVO vo = new ItemVO();
		Item record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(ItemQO qo) {
		Item record = new Item();
		// 商品编码=商品类型+运营商类型+销售地区+面值
		record.setId(qo.getId());
		record.setFacePrice(qo.getFacePrice());
		record.setCostPrice(BigDecimalUtils.integerMultiply(qo.getCostPrice()));
		record.setSalesPrice1(BigDecimalUtils.integerMultiply(qo.getSalesPrice1()));
		record.setSalesPrice2(BigDecimalUtils.integerMultiply(qo.getSalesPrice2()));
		record.setSalesPrice3(BigDecimalUtils.integerMultiply(qo.getSalesPrice3()));
		if (record.getSalesPrice1() < record.getSalesPrice2()) {
			throw new BaseException("销售价1不能低于销售价2");
		}
		if (record.getSalesPrice2() < record.getSalesPrice3()) {
			throw new BaseException("销售价2不能低于销售价3");
		}
		if (record.getSalesPrice3() < record.getCostPrice()) {
			throw new BaseException("销售价3不能低于成本价");
		}

		record.setItemStatus(qo.getItemStatus());
		return dao.updateById(record);
	}

}
