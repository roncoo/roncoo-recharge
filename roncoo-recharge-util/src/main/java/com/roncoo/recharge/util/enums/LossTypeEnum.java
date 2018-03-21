/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum LossTypeEnum {

	SECRET(1, "可以折损"), SECRET_WHITE(2, "不允许折损");

	private Integer code;

	private String desc;

	private LossTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
