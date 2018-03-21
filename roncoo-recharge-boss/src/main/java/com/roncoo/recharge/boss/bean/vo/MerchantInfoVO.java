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
 * 下游代理商
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class MerchantInfoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 1 正常 2 冻结 9 注销
	 */
	private Integer statusId;
	/**
	 * 用户ID
	 */
	private Long userInfoId;
	/**
	 * 账户ID
	 */
	private Long acctInfoId;
	/**
	 * APPID
	 */
	private String appId;
	/**
	 * 价格级别(对应商品的销售价位)
	 */
	private Integer priceLevel;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 公司全称
	 */
	private String compayName;
	/**
	 * 充值限制
	 */
	private Integer chargingLimit;
	/**
	 * 余额阈值
	 */
	private Integer warningBalance;
	/**
	 * 保证金
	 */
	private Integer depositBalance;
	/**
	 * 接口校验类型：1秘钥，2秘钥+白名单
	 */
	private Integer apiVerifyType;
	/**
	 * AppSeceret
	 */
	private String appSeceret;
	/**
	 * 白名单
	 */
	private String whiteList;
	/**
	 * 提现校验类型：1支付密码，2支付密码+动态码
	 */
	private Integer txVerifyType;
	/**
	 * 支付密码
	 */
	private String payPwd;
	/**
	 * 动态秘钥
	 */
	private String verifyCodeKey;

	private Long totalBalance;

}
