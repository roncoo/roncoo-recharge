/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.facade;

import com.roncoo.recharge.api.bo.RechargeBO;
import com.roncoo.recharge.api.bo.RechargeNotifyBO;
import com.roncoo.recharge.api.bo.RechargeOrderBO;
import com.roncoo.recharge.api.dto.RechargeDTO;
import com.roncoo.recharge.api.dto.RechargeNotifyDTO;
import com.roncoo.recharge.api.dto.RechargeOrderDTO;

/**
 * 充值接口<br/>
 * 
 * 说明：实现类必须保证不能向接口抛异常
 */
public interface RechargeFacade {

	/**
	 * 充值
	 */
	RechargeDTO recharge(RechargeBO rechargeBO);

	/**
	 * 校验
	 */
	RechargeNotifyDTO verify(RechargeNotifyBO rechargeNotifyBO);

	/**
	 * 订单查询接口
	 */
	RechargeOrderDTO order(RechargeOrderBO rechargeOrderBO);

}
