/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 兑换
 */
@Data
public class ExchangeRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "APPID[appId]不能为空")
	private String appId;
	
	@NotNull(message = "卡号类型[category]不能为空")
	private String category;
	
	@NotNull(message = "运营商类型[carrierType]不能为空")
	private Integer carrierType;

	@NotNull(message = "额度[amount]不能为空")
	private String amount;

	@NotNull(message = "卡号[cardNo]不能为空")
	private String cardNo;
	
	@NotNull(message = "卡密[cardPwd]不能为空")
	private String cardPwd;
	
	@Size(max = 30, message = "订单号[orderNo]长度最大30位")
	@NotNull(message = "订单号[orderNo]不能为空")
	private String orderNo;

	@Size(max = 14, message = "订单时间[orderTime]长度最大14位")
	@NotNull(message = "订单时间[orderTime]不能为空")
	private String orderTime;

	@Size(max = 300, message = "异步通知地址[returnUrl]长度最大300位")
	@NotNull(message = "异步通知地址[notifyUrl]不能为空")
	private String notifyUrl;

	@NotNull(message = "数据签名[sign]不能为空")
	private String sign;

}
