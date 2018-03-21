/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.manager;

import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.OrderTradePay;

public interface AcctInfoManager {

	/**
	 * 根据交易支付订单，账户金额变动进行事务操作
	 */
	AcctInfo commitBalance(OrderTradePay orderTradePay);
}
