/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {

	CREATE(0, "创建"), SUCCESS(2, "支付成功"), FAIL(3, "支付失败"), UNAFFIRM(9, "异常");

	private Integer code;

	private String desc;

	private PayStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
