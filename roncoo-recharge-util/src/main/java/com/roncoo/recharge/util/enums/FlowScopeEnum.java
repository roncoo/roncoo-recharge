/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.enums;

import lombok.Getter;

/**
 * 
 * 流量使用范围
 * 
 * 全国漫游-全国通道,全国流量.注:有人把全国漫游流量称为统付 <br/>
 * 省网漫游-省通道(只能该省号码充值的通道),全国流量.<br/>
 * 省网非漫游-省通道(只能该省号码充值的通道),省内流量.<br/>
 * 全国非漫游-不存在这种流量,全国通道充值的流量全部都是全国的.至少现在没有发现有这种流量<br/>
 * 
 * 备注:有人把省内称为本地;实际上还有种本地流量(指的在该城市范围内使用的流量)
 */
@Getter
public enum FlowScopeEnum {
	// 漫游 //非漫游
	WHOLE(1, "全国"), LOCAL(2, "本地");

	private Integer code;

	private String desc;

	private FlowScopeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	// 获取desc
	public static String getDesc(Integer code) {
		for (FlowScopeEnum em : FlowScopeEnum.values()) {
			if (em.getCode().equals(code)) {
				return em.getDesc();
			}
		}
		return "";
	}

}
