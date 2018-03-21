/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 账户信息
 * </p>
 *
 * @author wujing
 * @since 2017-12-27
 */
@Data
@Accessors(chain = true)
public class AcctInfoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 1 正常 2 冻结 9注销
	 */
	private Integer statusId;
	/**
	 * 用户ID
	 */
	private Long userInfoId;
	/**
	 * 总余额
	 */
	private Long totalBalance;
	/**
	 * 最后交易余额
	 */
	private Long lastTradeBalance;
	/**
	 * 最后交易时间
	 */
	private Date lastTradeDate;
	/**
	 * 校验码
	 */
	private String verificationCode;

}
