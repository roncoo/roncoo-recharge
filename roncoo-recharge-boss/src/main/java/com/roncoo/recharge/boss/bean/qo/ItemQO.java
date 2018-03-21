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
 * 商品管理
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class ItemQO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 销售地区（省编号）
	 */
	private String salesArea;
	/**
	 * 面值
	 */
	private String facePrice;
	/**
	 * 成本价格
	 */
	private String costPrice;
	/**
	 * 销售价格
	 */
	private String salesPrice1;
	/**
	 * 销售价格
	 */
	private String salesPrice2;
	/**
	 * 销售价格
	 */
	private String salesPrice3;
	/**
	 * 运营商类型：1移动，2 电信，3联通
	 */
	private Integer carrierType;
	/**
	 * 商品类别（1充值，2兑换）
	 */
	private Integer itemCategory;
	/**
	 * 商品类型：1流量，2话费，3兑换卡
	 */
	private Integer itemType;
	/**
	 * 状态：1 初始，2正常，3下架
	 */
	private Integer itemStatus;
	/**
	 * 商品编号
	 */
	private String itemNo;
	/**
	 * 商品名称
	 */
	private String itemName;
	/**
	 * 商品描述
	 */
	private String itemDesc;
	/**
	 * 使用范围：1本地，2全国
	 */
	private Integer flowScope;
	/**
	 * 包体类型：1日包，2月包，3季度包，4年包
	 */
	private Integer flowPackageType;
	/**
	 * 通道类型：1全国，2分省
	 */
	private Integer flowStreamType;
}
