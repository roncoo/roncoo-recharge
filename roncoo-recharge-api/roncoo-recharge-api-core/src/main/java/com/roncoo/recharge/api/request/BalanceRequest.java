/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * 余额查询
 */
@Data
public class BalanceRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "APPID[appId]不能为空")
	private String appId;

	@NotNull(message = "数据签名[sign]不能为空")
	private String sign;

}
