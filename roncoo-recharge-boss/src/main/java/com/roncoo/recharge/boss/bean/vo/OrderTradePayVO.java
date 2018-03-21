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
 * 支付订单
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class OrderTradePayVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 1创建 2支付成功 3支付失败 9异常
	 */
	private Integer payStatus;
	/**
	 * 交易订单ID
	 */
	private Long paySerialNo;
	/**
	 * 平台交易号
	 */
	private Long orderTradeNo;
	/**
	 * 用户ID
	 */
	private Long userInfoId;
	/**
	 * 账户ID
	 */
	private Long acctInfoId;
	/**
	 * 账户日志ID
	 */
	private Long acctLogId;
	/**
	 * 商品ID
	 */
	private Long itemId;
	/**
	 * 商品编号
	 */
	private String itemNo;
	/**
	 * 销售价
	 */
	private Integer salesPrice;
	/**
	 * 支付类型：1余额
	 */
	private Integer payType;
	/**
	 * 交易类型：1 入账 2 出账
	 */
	private Integer tradeType;
	/**
	 * 错误信息
	 */
	private String errorMsg;

}
