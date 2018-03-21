/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum ItemStatusEnum {

	INIT(1, "初始化"), UP(2, "上架"), DOWN(3, "下架");

	private Integer code;

	private String desc;

	private ItemStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
