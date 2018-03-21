/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum TradeStatusEnum {

	SUCCESS(1, "成功"), FAIL(2, "失败"), UNCONFIRM(3, "未确认");

	private Integer code;

	private String desc;

	private TradeStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
