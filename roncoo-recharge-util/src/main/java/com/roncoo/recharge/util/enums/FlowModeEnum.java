/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum FlowModeEnum {

	CURRENT(1, "立即生效"), NEXT(2, "下月生效");

	private Integer code;

	private String desc;

	private FlowModeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
