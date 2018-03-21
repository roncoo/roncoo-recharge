/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

/**
 * 通道类型
 */
@Getter
public enum FlowStreamTypeEnum {

	WHOLE(1, "全国"), PROVINCE(2, "分省");

	private Integer code;

	private String desc;

	private FlowStreamTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	// 获取desc
	public static String getDesc(Integer code) {
		for (FlowStreamTypeEnum em : FlowStreamTypeEnum.values()) {
			if (em.getCode().equals(code)) {
				return em.getDesc();
			}
		}
		return "";
	}

}
