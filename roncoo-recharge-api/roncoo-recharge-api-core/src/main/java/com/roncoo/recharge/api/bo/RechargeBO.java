/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 充值-请求实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RechargeBO extends BaseBO {

	private static final long serialVersionUID = 1L;

	private String notifyUrl; // 平台接收上游的回调地址

	private String mobile; // 手机号

	private String amount; // 数量

	private String supplySerialNo; // 平台发送给上游订单号

}
