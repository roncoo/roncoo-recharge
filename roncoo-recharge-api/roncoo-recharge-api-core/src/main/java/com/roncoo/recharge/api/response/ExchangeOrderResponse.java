/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.response;

import java.io.Serializable;

import lombok.Data;

/**
 * 订单查询-返回下游实体
 */
@Data
public class ExchangeOrderResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderNo;

	private Long tradeNo;

	private String productNo;
	
	private Integer productType;

	private String moblie;
	
	private String facePrice;
	
	private Integer salesPrice;

}
