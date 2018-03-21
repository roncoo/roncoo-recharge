/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.dto;

import java.io.Serializable;

import com.roncoo.recharge.util.enums.TradeStatusEnum;

import lombok.Data;

/**
 * 流量回调通知-返回实体
 */
@Data
public class RechargeNotifyDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	// 必填字段-开始
	private TradeStatusEnum tradeStatusEnum = TradeStatusEnum.FAIL; // 默认

	private String returnMsg; // 回调需要返回上游信息

	private String errorMsg; // 失败原因

	private Long supplySerialNo; // 上游供货流水号
	// 必填字段-结束
}
