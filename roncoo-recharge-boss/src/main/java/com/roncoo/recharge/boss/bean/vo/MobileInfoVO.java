/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.bean.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class MobileInfoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * 号码片段
	 */
	private String mobilePrefix;
	/**
	 * 省份代码
	 */
	private String provinceCode;
	/**
	 * 市代码
	 */
	private String cityCode;
	/**
	 * 区号
	 */
	private String areaCode;
	/**
	 * 省份
	 */
	private String provinceName;
	/**
	 * 市
	 */
	private String cityName;
	/**
	 * 运营商名称
	 */
	private String carrierName;
	/**
	 * 运营商类型：1移动，2 电信，3联通
	 */
	private Integer carrierType;

}
