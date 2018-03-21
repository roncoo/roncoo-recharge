/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum PayTypeEnum {

	BALANCE(1, "余额");

	private Integer code;

	private String desc;

	private PayTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
