/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.bean.qo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wujing
 * @since 2017-12-30
 */
@Data
@Accessors(chain = true)
public class AreaInfoQO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * 省编号
	 */
	private String provinceCode;
	/**
	 * 市编号
	 */
	private String cityCode;
	/**
	 * 区号
	 */
	private String areaCode;
	/**
	 * 省名称
	 */
	private String provinceName;
	/**
	 * 市名称
	 */
	private String cityName;
	/**
	 * 分类：1.省 2 市
	 */
	private Integer areaType;
}
