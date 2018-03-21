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
 * 交易订单
 * </p>
 *
 * @author wujing
 * @since 2018-01-06
 */
@Data
@Accessors(chain = true)
public class OrderTradeQO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 相当于流水号
	 */
	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	/**
	 * 1创建 处理中 2 成功 3 失败 9 未确认
	 */
	private Integer orderStatus;
	/**
	 * 下游用户ID
	 */
	private Long userInfoId;
	/**
	 * 支付单ID
	 */
	private Long acctInfoId;
	/**
	 * 供应商商品ID
	 */
	private Long itemSupplyId;
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
	 * 销售价格
	 */
	private Integer salesPrice;
	/**
	 * 面值
	 */
	private String facePrice;
	/**
	 * 成本价
	 */
	private Integer costPrice;
	/**
	 * 实际扣费
	 */
	private Integer actualCost;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 * 接口方式：1外放 2 WEB 3 APP
	 */
	private Integer channel;
	/**
	 * 交易订单
	 */
	private Long tradeNo;
	/**
	 * 支付流水号
	 */
	private Long paySerialNo;
	/**
	 * 下游订单号
	 */
	private String orderNo;
	/**
	 * 下游订单时间
	 */
	private Date orderTime;
	/**
	 * 运营商类型：1移动，2 电信，3联通
	 */
	private Integer carrierType;
	/**
	 * 上游供货摘要
	 */
	private String supplyDesc;
	/**
	 * 供货次数
	 */
	private Integer supplyCount;
	/**
	 * 供货索引
	 */
	private Integer supplyIndex;
	/**
	 * 回调地址
	 */
	private String notifyUrl;
	/**
	 * 流量生效方式：1立即生效，2下月生效
	 */
	private Integer flowMode;
	/**
	 * 流量范围：1全国，2本地
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
	/**
	 * 卡号
	 */
	private String cardNo;
	/**
	 * 卡密
	 */
	private String cardPwd;
	/**
	 * 是否补充
	 */
	private Integer repeatType;
	/**
	 * 上游供货流水号
	 */
	private Long supplySerialNo;
}
