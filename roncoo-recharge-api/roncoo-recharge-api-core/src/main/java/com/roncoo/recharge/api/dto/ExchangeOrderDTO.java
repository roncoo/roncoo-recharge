/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.dto;

import java.io.Serializable;

import com.roncoo.recharge.util.enums.TradeStatusEnum;

import lombok.Data;

/**
 * 卡密兑换-返回实体
 */
@Data
public class ExchangeOrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private TradeStatusEnum tradeStatusEnum = TradeStatusEnum.FAIL; // 默认

	private String errorMsg; // 失败原因

	private String tradeNo;

}
