/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.facade;

import com.roncoo.recharge.api.bo.ExchangeBO;
import com.roncoo.recharge.api.bo.ExchangeNotifyBO;
import com.roncoo.recharge.api.bo.ExchangeOrderBO;
import com.roncoo.recharge.api.dto.ExchangeDTO;
import com.roncoo.recharge.api.dto.ExchangeNotifyDTO;
import com.roncoo.recharge.api.dto.ExchangeOrderDTO;

/**
 * 兑换接口 <br/>
 * 
 * 说明：实现类必须保证不能向接口抛异常
 */
public interface ExchangeFacade {

	/**
	 * 兑换接口
	 */
	ExchangeDTO exchange(ExchangeBO exchangeBO);

	/**
	 * 校验接口
	 */
	ExchangeNotifyDTO verify(ExchangeNotifyBO exchangeNotifyBO);
	
	/**
	 * 订单查询接口
	 */
	ExchangeOrderDTO order(ExchangeOrderBO exchangeOrderBO);

}
