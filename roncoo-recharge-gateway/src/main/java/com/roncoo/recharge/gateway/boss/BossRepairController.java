/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.boss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.gateway.boss.biz.BossRepairBiz;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.base.Result;

/**
 * 接口
 */
@RestController
@RequestMapping(value = "/boss/repair")
public class BossRepairController extends BaseController {

	@Autowired
	private BossRepairBiz biz;

	/**
	 * 补兑换接口
	 */
	@RequestMapping(value = "/exchange/{tradeNo}")
	public Result<OrderTrade> repairExchange(@PathVariable(value = "tradeNo") Long tradeNo) {
		return biz.repairExchange(tradeNo);
	}

	/**
	 * 补通知接口
	 */
	@RequestMapping(value = "/exchange/notify/{tradeNo}")
	public Result<String> repairExchangeNotify(@PathVariable(value = "tradeNo") Long tradeNo) {
		return biz.repairExchangeNotify(tradeNo);
	}

	/**
	 * 补充值接口
	 */
	@RequestMapping(value = "/recharge/{tradeNo}")
	public Result<OrderTrade> repairRecharge(@PathVariable(value = "tradeNo") Long tradeNo) {
		return biz.repairRecharge(tradeNo);
	}

	/**
	 * 补通知接口
	 */
	@RequestMapping(value = "/recharge/notify/{tradeNo}")
	public Result<String> repairRechargeNotify(@PathVariable(value = "tradeNo") Long tradeNo) {
		return biz.repairRechargeNotify(tradeNo);
	}

}
