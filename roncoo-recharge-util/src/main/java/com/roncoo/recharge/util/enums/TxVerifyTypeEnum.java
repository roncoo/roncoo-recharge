/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum TxVerifyTypeEnum {

	SECRET(1, "支付密码"), SECRET_VBR(2, "支付密码+动态码");

	private Integer code;

	private String desc;

	private TxVerifyTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
