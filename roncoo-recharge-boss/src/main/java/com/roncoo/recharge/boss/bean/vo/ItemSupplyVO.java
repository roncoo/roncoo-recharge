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
 * 供应商商品管理
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class ItemSupplyVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 状态：1 初始，2正常，3下架
	 */
	private Integer itemStatus;
	/**
	 * 商品iD
	 */
	private Long itemId;
	/**
	 * 商品编号
	 */
	private String itemNo;
	/**
	 * 商品名称
	 */
	private String itemName;
	/**
	 * 供应商编号
	 */
	private Long supplyInfoId;
	/**
	 * 上游编码
	 */
	private String supplyCode;
	/**
	 * 名称
	 */
	private String supplyName;
	/**
	 * 优先级
	 */
	private Integer priority;
	/**
	 * 是否折损
	 */
	private Integer lossType;
	/**
	 * 折损次数
	 */
	private Integer lossTime;
	/**
	 * 商品面值
	 */
	private String facePrice;
	/**
	 * 成本价
	 */
	private Integer costPrice;
	/**
	 * 上游商品ID
	 */
	private String supplyProductCode;

}
