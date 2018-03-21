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
 * 上游供货商
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class SupplyInfoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 1 正常 2 冻结 9 注销
	 */
	private Integer statusId;
	/**
	 * 供货商类别（1充值，2兑换）
	 */
	private Integer supplyCategory;
	/**
	 * 上游编码
	 */
	private String supplyCode;
	/**
	 * 名称
	 */
	private String supplyName;
	/**
	 * 公司名
	 */
	private String compayName;
	/**
	 * 参数：请求URl
	 */
	private String paraRequestUrl;
	/**
	 * 参数：订单查询url
	 */
	private String paraOrderUrl;
	/**
	 * 参数：余额查询URL
	 */
	private String paraBalanceUrl;
	/**
	 * 参数：用户ID
	 */
	private String paraUserId;
	/**
	 * 参数：key
	 */
	private String paraKey;
	/**
	 * 参数：seceret
	 */
	private String paraSeceret;
	/**
	 * 扩展参数1
	 */
	private String paraExt1;
	/**
	 * 扩展参数2
	 */
	private String paraExt2;
	/**
	 * 扩展参数3
	 */
	private String paraExt3;
	/**
	 * 扩展参数4
	 */
	private String paraExt4;
	/**
	 * 扩展参数5
	 */
	private String paraExt5;

}
