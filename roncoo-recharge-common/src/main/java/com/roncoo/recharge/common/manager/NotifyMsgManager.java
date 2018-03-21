/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.manager;

import com.roncoo.recharge.common.entity.OrderTrade;

public interface NotifyMsgManager {

	/**
	 * 消息通知
	 */
	void notifyMsg(OrderTrade orderTrade);
}
