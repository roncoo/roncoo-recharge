/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum StatusIdEnum {

	NORMAL(1, "正常"), FREEZE(2, "冻结"), CANCEL(3, "注销");

	private Integer code;

	private String desc;

	private StatusIdEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
