/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {

	CREATE(0, "创建"), WARTING(1, "处理中"), SUCCESS(2, "成功"), FAIL(3, "失败"), UNAFFIRM(9, "未确认");

	private Integer code;

	private String desc;

	private OrderStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
