/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum RepeatTypeEnum {

	YES(1, "补充"), NO(2, "未补充");

	private Integer code;

	private String desc;

	private RepeatTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
