/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.boss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.recharge.api.dto.ExchangeOrderDTO;
import com.roncoo.recharge.api.dto.RechargeOrderDTO;
import com.roncoo.recharge.gateway.boss.biz.BossQueryBiz;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.base.Result;

/**
 * 查询接口
 */
@RestController
@RequestMapping(value = "/boss/query")
public class BossQueryController extends BaseController {

	@Autowired
	private BossQueryBiz biz;

	/**
	 * 订单查询接口
	 */
	@RequestMapping(value = "/exchange/order/{supplySerialNo}")
	public Result<ExchangeOrderDTO> exchangeOrder(@PathVariable(value = "supplySerialNo") Long supplySerialNo) {
		return biz.exchangeOrder(supplySerialNo);
	}

	/**
	 * 订单查询接口
	 */
	@RequestMapping(value = "/recharge/order/{supplySerialNo}")
	public Result<RechargeOrderDTO> rechargeOrder(@PathVariable(value = "supplySerialNo") Long supplySerialNo) {
		return biz.rechargeOrder(supplySerialNo);
	}

	/**
	 * 余额查询接口
	 */
	@RequestMapping(value = "/balance/{supplyCode}")
	public Result<String> queryBalance(@PathVariable(value = "supplyCode") String supplyCode) {
		return biz.queryBalance(supplyCode);
	}

}
