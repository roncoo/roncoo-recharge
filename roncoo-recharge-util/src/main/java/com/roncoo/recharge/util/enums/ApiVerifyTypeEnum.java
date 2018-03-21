/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum ApiVerifyTypeEnum {

	SECRET(1, "秘钥"), SECRET_WHITE(2, "秘钥+白名单");

	private Integer code;

	private String desc;

	private ApiVerifyTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
