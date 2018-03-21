/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.HashMap;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.OrderSupplyQO;
import com.roncoo.recharge.boss.bean.vo.OrderSupplyVO;
import com.roncoo.recharge.common.dao.OrderSupplyDao;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderSupplyExample;
import com.roncoo.recharge.common.entity.OrderSupplyExample.Criteria;
import com.roncoo.recharge.util.ConfigUtil;
import com.roncoo.recharge.util.Constants;
import com.roncoo.recharge.util.HttpRestUtil;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.util.enums.ItemCategoryEnum;
import com.roncoo.recharge.util.enums.UserTypeEnum;
import com.xiaoleilu.hutool.util.ObjectUtil;

/**
 * 供应商订单
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class OrderSupplyService {

	@Autowired
	private OrderSupplyDao dao;

	public Page<OrderSupplyVO> listForPage(int pageCurrent, int pageSize, OrderSupplyQO qo) {
		OrderSupplyExample example = new OrderSupplyExample();
		Criteria c = example.createCriteria();
		if (ObjectUtil.isNotNull(qo.getOrderTradeNo())) {
			c.andOrderTradeNoEqualTo(qo.getOrderTradeNo());
		}
		if (ObjectUtil.isNotNull(qo.getSupplySerialNo())) {
			c.andSupplySerialNoEqualTo(qo.getSupplySerialNo());
		}
		// 下游商户
		if (UserTypeEnum.MERCHANTS.getCode().equals(Integer.valueOf(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.USER_TYPE).toString()))) {
			c.andUserInfoIdEqualTo(Long.valueOf(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.USER_TYPE).toString()));
		}
		example.setOrderByClause(" id desc ");
		Page<OrderSupply> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, OrderSupplyVO.class);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public OrderSupplyVO getById(Long id) {
		OrderSupplyVO vo = new OrderSupplyVO();
		OrderSupply record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(OrderSupplyQO qo) {
		OrderSupply record = new OrderSupply();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

	@SuppressWarnings("rawtypes")
	public Result<HashMap> check(Long supplySerialNo, Integer itemCategory) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("supplySerialNo", supplySerialNo);
		Result<HashMap> result = Result.error("查询失败");
		if (itemCategory.equals(ItemCategoryEnum.EXCHANGE.getCode())) {
			// 兑换核单
			result = HttpRestUtil.getForResultObject(ConfigUtil.CHECK_ORDER_EXCHANGE_URL, map, HashMap.class);
		} else {
			// 充值核单
			result = HttpRestUtil.getForResultObject(ConfigUtil.CHECK_ORDER_RECHARGE_URL, map, HashMap.class);
		}
		return result;
	}

}
