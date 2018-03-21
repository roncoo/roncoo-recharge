/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.bo;

import java.io.Serializable;

import lombok.Data;

/**
 * 请求实体
 */
@Data
public class BaseBO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String paraRequestUrl;

	private String paraQueryUrl;

	private String paraBalanceUrl;

	private String paraUserId;

	private String paraKey;

	private String paraSeceret;

	private String paraExt1;

	private String paraExt2;

	private String paraExt3;

	private String paraExt4;

	private String paraExt5;

}
