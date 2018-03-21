/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum UserTypeEnum {

	USER(1, "内部用户"), MERCHANTS(2, "下游商户");

	private Integer code;

	private String desc;

	private UserTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
