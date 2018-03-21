/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

/**
 * 
 * 包体类型
 *
 */
@Getter
public enum FlowPackageTypeEnum {

	MONTH(1, "月包"), //

	SEASON(2, "季度包"), //

	HALF(3, "半年包"), //

	YEAR(4, "年包"), //

	ONE_DAY(5, "1日包"), //

	THREE_DAY(6, "3日包"), //

	SEVEN_DAY(7, "7日包"), //

	RED(8, "红包"), //

	SHARE(9, "共享");

	private Integer code;

	private String desc;

	private FlowPackageTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	// 获取desc
	public static String getDesc(Integer code) {
		for (FlowPackageTypeEnum em : FlowPackageTypeEnum.values()) {
			if (em.getCode().equals(code)) {
				return em.getDesc();
			}
		}
		return "";
	}

}
