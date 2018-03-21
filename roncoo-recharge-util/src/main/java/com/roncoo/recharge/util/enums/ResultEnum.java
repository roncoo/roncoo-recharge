/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

	ERROR(999, "正常"), SUCCESS(200, "冻结");

	private Integer code;

	private String desc;

	private ResultEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
