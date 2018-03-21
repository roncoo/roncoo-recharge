/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.OrderTradePayQO;
import com.roncoo.recharge.boss.bean.vo.OrderTradePayVO;
import com.roncoo.recharge.common.dao.OrderTradePayDao;
import com.roncoo.recharge.common.entity.OrderTradePay;
import com.roncoo.recharge.common.entity.OrderTradePayExample;
import com.roncoo.recharge.common.entity.OrderTradePayExample.Criteria;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;

/**
 * 支付订单
 *
 * @author wujing
 * @since 2017-12-19
 */
@Component
public class OrderTradePayService {

	@Autowired
	private OrderTradePayDao dao;

	public Page<OrderTradePayVO> listForPage(int pageCurrent, int pageSize, OrderTradePayQO qo) {
		OrderTradePayExample example = new OrderTradePayExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<OrderTradePay> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, OrderTradePayVO.class);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public OrderTradePayVO getById(Long id) {
		OrderTradePayVO vo = new OrderTradePayVO();
		OrderTradePay record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(OrderTradePayQO qo) {
		OrderTradePay record = new OrderTradePay();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

}
