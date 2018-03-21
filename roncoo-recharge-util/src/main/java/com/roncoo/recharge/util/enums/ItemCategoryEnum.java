/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

@Getter
public enum ItemCategoryEnum {

	RECHARGE(1, "充值"), EXCHANGE(2, "兑换");

	private Integer code;

	private String desc;

	private ItemCategoryEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	// 获取desc
	public static String getDesc(Integer code) {
		for (ItemCategoryEnum em : ItemCategoryEnum.values()) {
			if (em.getCode().equals(code)) {
				return em.getDesc();
			}
		}
		return "";
	}

}
