/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum SupplyCategoryEnum {

	RECHARGE(1, "充值供货商"), EXCHANGE(2, "兑换供货商");

	private Integer code;

	private String desc;

	private SupplyCategoryEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	// 获取desc
	public static String getDesc(Integer code) {
		for (SupplyCategoryEnum em : SupplyCategoryEnum.values()) {
			if (em.getCode().equals(code)) {
				return em.getDesc();
			}
		}
		return "";
	}

}
