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
 * 供应商订单
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class OrderSupplyQO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 0创建 1处理中 2 成功 3 失败 9 未确认
	 */
	private Integer orderStatus;
	/**
	 * 平台交易号
	 */
	private Long orderTradeNo;
	/**
	 * 供应商商品ID
	 */
	private Long itemSupplyId;
	/**
	 * 用户ID
	 */
	private Long userInfoId;
	/**
	 * 商品ID
	 */
	private Long itemId;
	/**
	 * 商品类别（1充值，2兑换）
	 */
	private Integer itemCategory;
	/**
	 * 商品类型：1流量，2话费
	 */
	private Integer itemType;
	/**
	 * 商品编号
	 */
	private String itemNo;
	/**
	 * 商品名称
	 */
	private String itemName;
	/**
	 * 客户手机号码
	 */
	private String mobile;
	/**
	 * 上游商户编号
	 */
	private Long supplyInfoId;
	/**
	 * 上游编码
	 */
	private String supplyCode;
	/**
	 * 上游商户名称
	 */
	private String supplyName;
	/**
	 * 上游供货流水号
	 */
	private Long supplySerialNo;
	/**
	 * 商品面值
	 */
	private String supplyFacePrice;
	/**
	 * 平台录入成本价
	 */
	private Integer supplyCostPrice;
	/**
	 * 上游实际扣款价
	 */
	private Integer supplyActualCost;
	/**
	 * 上游充值信息
	 */
	private String supplyDesc;
	/**
	 * 是否补充
	 */
	private Integer repeatType;
}
