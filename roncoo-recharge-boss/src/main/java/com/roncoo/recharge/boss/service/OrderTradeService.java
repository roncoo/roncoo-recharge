/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.OrderTradeQO;
import com.roncoo.recharge.boss.bean.vo.OrderTradeVO;
import com.roncoo.recharge.common.dao.OrderTradeDao;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.OrderTradeExample;
import com.roncoo.recharge.common.entity.OrderTradeExample.Criteria;
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
 * 交易订单
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class OrderTradeService {

	@Autowired
	private OrderTradeDao dao;

	public Page<OrderTradeVO> listForPage(int pageCurrent, int pageSize, OrderTradeQO qo) {
		OrderTradeExample example = new OrderTradeExample();
		Criteria c = example.createCriteria();

		if (ObjectUtil.isNotNull(qo.getTradeNo())) {
			c.andTradeNoGreaterThanOrEqualTo(qo.getTradeNo());
		}

		if (StringUtils.isNotBlank(qo.getOrderNo())) {
			c.andOrderNoLike(PageUtil.likeRight(qo.getOrderNo()));
		}

		// 下游商户
		if (UserTypeEnum.MERCHANTS.getCode().equals(Integer.valueOf(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.USER_TYPE).toString()))) {
			c.andUserInfoIdEqualTo(Long.valueOf(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.USER_TYPE).toString()));
		}
		example.setOrderByClause(" id desc ");
		Page<OrderTrade> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, OrderTradeVO.class);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public OrderTradeVO getById(Long id) {
		OrderTradeVO vo = new OrderTradeVO();
		OrderTrade record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(OrderTradeQO qo) {
		OrderTrade record = new OrderTrade();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

	public Result<OrderTrade> repair(Long tradeNo, Integer itemCategory) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("tradeNo", tradeNo);
		if (itemCategory.equals(ItemCategoryEnum.EXCHANGE.getCode())) {
			// 兑换补单
			return HttpRestUtil.getForResultObject(ConfigUtil.REPAIR_ORDER_EXCHANGE_URL, map, OrderTrade.class);
		} else {
			// 充值补单
			return HttpRestUtil.getForResultObject(ConfigUtil.REPAIR_ORDER_RECHARGE_URL, map, OrderTrade.class);
		}
	}

	public Result<String> notify(Long tradeNo, Integer itemCategory) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("tradeNo", tradeNo);
		if (itemCategory.equals(ItemCategoryEnum.EXCHANGE.getCode())) {
			// 兑换补通知
			return HttpRestUtil.getForResultObject(ConfigUtil.REPAIR_NOTIFY_EXCHANGE_URL, map, String.class);
		} else {
			// 充值补通知
			return HttpRestUtil.getForResultObject(ConfigUtil.REPAIR_NOTIFY_RECHARGE_URL, map, String.class);
		}
	}

}
