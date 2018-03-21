/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.facade;

import com.roncoo.recharge.api.bo.BalanceBO;
import com.roncoo.recharge.api.dto.BalanceDTO;

/**
 * 查询接口 <br/>
 * 
 * 说明：实现类必须保证不能向接口抛异常
 */
public interface BalanceFacade {

	/**
	 * 余额查询接口
	 */
	BalanceDTO balance(BalanceBO balanceBO);

}
