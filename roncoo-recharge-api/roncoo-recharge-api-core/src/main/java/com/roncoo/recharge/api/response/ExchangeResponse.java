/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.response;

import java.io.Serializable;

import lombok.Data;

/**
 * 卡密兑换-返回下游实体
 */
@Data
public class ExchangeResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String amount;

	private String cardNo;

	private String orderNo;

	private String tradeNo;

}
