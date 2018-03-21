/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 订单查询
 */
@Data
public class ExchangeOrderRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "APPID[appId]不能为空")
	private String appId;

	@Size(max = 30, message = "订单号[orderNo]长度最大30位")
	@NotNull(message = "订单号[orderNo]不能为空")
	private String orderNo;

	@Size(max = 14, message = "交易号[tradeNo]长度最大20位")
	@NotNull(message = "交易号[tradeNo]不能为空")
	private Long tradeNo;

	@NotNull(message = "数据签名[sign]不能为空")
	private String sign;

}
