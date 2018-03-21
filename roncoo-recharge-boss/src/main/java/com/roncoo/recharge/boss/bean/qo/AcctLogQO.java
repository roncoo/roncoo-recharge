/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.bean.qo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 账户日志
 * </p>
 *
 * @author wujing
 * @since 2017-12-27
 */
@Data
@Accessors(chain = true)
public class AcctLogQO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 用户ID
	 */
	private Long userInfoId;
	/**
	 * 账户ID
	 */
	private Long acctInfoId;
	/**
	 * 交易单类型 1支付单 2充值单 3退款单 4提现单
	 */
	private Integer billType;
	/**
	 * 账单状态：1 成功 2 异常
	 */
	private Integer billStatus;
	/**
	 * 交易类型：1 入账 2 出账
	 */
	private Integer tradeType;
	/**
	 * 支付交易订单号
	 */
	private Long paySerialNo;
	/**
	 * 金额
	 */
	private Integer amount;
	/**
	 * 余额
	 */
	private Long totalBalance;
}
