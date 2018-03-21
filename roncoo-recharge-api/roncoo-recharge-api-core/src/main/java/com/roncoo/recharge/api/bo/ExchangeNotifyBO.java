/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.bo;

import java.io.Serializable;
import java.util.TreeMap;

import lombok.Data;

/**
 * 卡密回调通知-请求实体
 */
@Data
public class ExchangeNotifyBO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String supplyCode;

	private String supplyName;

	private String compayName;

	private String paraUserId;

	private String paraKey;

	private String paraSeceret;

	private String paraExt1;

	private String paraExt2;

	private String paraExt3;

	private String paraExt4;

	private String paraExt5;
	
	TreeMap<String, Object> paramMap;
}
