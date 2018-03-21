/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum TradeTypeEnum {

	ADD(1, "入账"), SUBTRACT(2, "出账");

	private Integer code;

	private String desc;

	private TradeTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
