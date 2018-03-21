/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 充值
 */
@Data
public class RechargeRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "APPID[appId]不能为空")
	private String appId;

	@NotNull(message = "手机号[mobile]不能为空")
	@Size(min=11, max = 11, message = "手机号码不正确")
	private String mobile;
	
	@NotNull(message = "商品类型[productType]不能为空")
	private Integer productType;
	
	// 商品NO
	private String productNo;
	
	// 数量，100：话费代表100元，流量代表100MB
	private String amount;

	private String scope;
	
	private Integer packageType;
	
	private Integer streamType;
	
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
