/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.service.manager.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.roncoo.recharge.api.request.RechargeRequest;
import com.roncoo.recharge.common.dao.AreaInfoDao;
import com.roncoo.recharge.common.dao.ItemDao;
import com.roncoo.recharge.common.dao.ItemSupplyDao;
import com.roncoo.recharge.common.dao.MerchantInfoDao;
import com.roncoo.recharge.common.dao.MobileInfoDao;
import com.roncoo.recharge.common.dao.OrderSupplyDao;
import com.roncoo.recharge.common.dao.OrderTradeDao;
import com.roncoo.recharge.common.dao.OrderTradePayDao;
import com.roncoo.recharge.common.dao.SupplyInfoDao;
import com.roncoo.recharge.common.entity.AreaInfo;
import com.roncoo.recharge.common.entity.Item;
import com.roncoo.recharge.common.entity.ItemSupply;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.MobileInfo;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.OrderTradePay;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.common.manager.AcctInfoManager;
import com.roncoo.recharge.common.manager.NotifyMsgManager;
import com.roncoo.recharge.gateway.service.manager.RechargeManager;
import com.roncoo.recharge.util.BigDecimalUtils;
import com.roncoo.recharge.util.IdWorker;
import com.roncoo.recharge.util.NOUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.CarrierTypeEnum;
import com.roncoo.recharge.util.enums.ChannelEnum;
import com.roncoo.recharge.util.enums.ItemCategoryEnum;
import com.roncoo.recharge.util.enums.ItemStatusEnum;
import com.roncoo.recharge.util.enums.ItemTypeEnum;
import com.roncoo.recharge.util.enums.OrderStatusEnum;
import com.roncoo.recharge.util.enums.PayStatusEnum;
import com.roncoo.recharge.util.enums.PayTypeEnum;
import com.roncoo.recharge.util.enums.PriceLevelEnum;
import com.roncoo.recharge.util.enums.RepeatTypeEnum;
import com.roncoo.recharge.util.enums.StatusIdEnum;
import com.roncoo.recharge.util.enums.TradeTypeEnum;
import com.roncoo.recharge.util.exception.BaseException;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.CollectionUtil;
import com.xiaoleilu.hutool.util.ObjectUtil;

@Component
public class RechargeManagerImpl extends BaseRoncoo implements RechargeManager {

	@Autowired
	private OrderTradeDao orderTradeDao;
	@Autowired
	private OrderSupplyDao orderSupplyDao;
	@Autowired
	private OrderTradePayDao orderTradePayDao;
	@Autowired
	private MerchantInfoDao merchantInfoDao;
	@Autowired
	private ItemSupplyDao itemSupplyDao;
	@Autowired
	private SupplyInfoDao supplyInfoDao;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private MobileInfoDao mobileInfoDao;
	@Autowired
	private AreaInfoDao areaInfoDao;

	@Autowired
	private AcctInfoManager acctInfoManager;

	@Autowired(required = false)
	private List<NotifyMsgManager> notifyMsgManagerList;

	@Override
	public Result<Item> checkItem(RechargeRequest rechargeRequest) {
		if (StringUtils.hasText(rechargeRequest.getProductNo())) {
			// 商品编号存在，则根据商品编号查找商品
			Item item = itemDao.getByItemNo(rechargeRequest.getProductNo());
			if (null != item) {
				if (!item.getItemType().equals(rechargeRequest.getProductType())) {
					return Result.error("商品类型和商品编号不对应");
				}
				return Result.success(item);
			}
		}

		if (ItemTypeEnum.TELEPHONE.getCode().equals(rechargeRequest.getProductType())) {
			// 话费

			// 不存在，根据手机归属地、运营商类型、面值查找
			MobileInfo mobileInfo = mobileInfoDao.getByMobilePrefix(rechargeRequest.getMobile().substring(0, 7));
			if (null == mobileInfo) {
				// 没记录，调用接口获取
				mobileInfo = getMobileInfoByApi(rechargeRequest.getMobile());
			}
			List<Item> listItem = itemDao.listByItemCategoryAndItemTypeAndProvinceCodeAndCarrierTypeAndFacePrice(ItemCategoryEnum.RECHARGE.getCode(), ItemTypeEnum.TELEPHONE.getCode(), mobileInfo.getProvinceCode(), mobileInfo.getCarrierType(), rechargeRequest.getAmount());

			if (listItem.isEmpty()) {
				return Result.error("找不到对应的商品");
			}

			if (listItem.size() > 1) {
				return Result.error("商品匹配错误，存在多个商品");
			}

			Item item = listItem.get(0);
			if (item.getItemStatus().equals(ItemStatusEnum.UP.getCode())) {
				return Result.success(item);
			}
		} else if (ItemTypeEnum.FLOW.getCode().equals(rechargeRequest.getPackageType())) {
			// 流量
			if (!rechargeRequest.getAmount().toUpperCase().endsWith("B")) {
				return Result.error("Amount填写格式不正确，请以MB或者GB结尾");
			}
			Integer facePrice = 0;
			try {
				if (rechargeRequest.getAmount().toUpperCase().endsWith("MB")) {
					facePrice = BigDecimalUtils.integerMultiply(rechargeRequest.getAmount().substring(0, rechargeRequest.getAmount().length() - 2));
				} else if (rechargeRequest.getAmount().toUpperCase().endsWith("GB")) {
					facePrice = BigDecimalUtils.integerMultiply(rechargeRequest.getAmount().substring(0, rechargeRequest.getAmount().length() - 2));
				}
			} catch (NumberFormatException e) {
				return Result.error("Amount填写格式不正确");
			}
			// 不存在，根据手机归属地、运营商类型、面值查找
			MobileInfo mobileInfo = mobileInfoDao.getByMobilePrefix(rechargeRequest.getMobile().substring(0, 7));
			if (null == mobileInfo) {
				// 没记录，调用接口获取
				mobileInfo = getMobileInfoByApi(rechargeRequest.getMobile());
			}
			List<Item> listItem = itemDao.listByItemCategoryAndItemTypeAndProvinceCodeAndCarrierTypeAndFacePrice(ItemCategoryEnum.RECHARGE.getCode(), ItemTypeEnum.FLOW.getCode(), mobileInfo.getProvinceCode(), mobileInfo.getCarrierType(), facePrice.toString());

			if (CollectionUtil.isEmpty(listItem)) {
				return Result.error("找不到对应的商品");
			}

			if (listItem.size() > 1) {
				return Result.error("商品匹配错误，存在多个商品");
			}

			Item item = listItem.get(0);
			if (item.getItemStatus().equals(ItemStatusEnum.UP.getCode())) {
				return Result.success(item);
			}
		}
		return Result.error("该商品没上架");
	}

	@Override
	public Result<MerchantInfo> checkMch(String appId) {
		MerchantInfo merchantInfo = merchantInfoDao.getByAppId(appId);
		if (ObjectUtil.isNull(merchantInfo)) {
			return Result.error("商户appId错误或者不存在");
		}
		if (merchantInfo.getStatusId().equals(StatusIdEnum.FREEZE.getCode())) {
			return Result.error("该商户被冻结");
		}
		if (merchantInfo.getStatusId().equals(StatusIdEnum.CANCEL.getCode())) {
			return Result.error("该商户被注销");
		}
		return Result.success(merchantInfo);
	}

	@Override
	public Result<OrderTrade> checkOrder(String orderNo, Long userInfoId) {
		OrderTrade orderTrade = orderTradeDao.getByOrderNoAndUserInfoId(orderNo, userInfoId);
		if (ObjectUtil.isNotNull(orderTrade)) {
			return Result.error("订单已经存在");
		}
		return Result.success(orderTrade);
	}

	@Override
	public Result<SupplyInfo> getSupplyInfo(OrderTrade orderTrade) {
		List<ItemSupply> listItemSuppley = itemSupplyDao.listByItemId(orderTrade.getItemId());
		if (listItemSuppley.isEmpty()) {
			return Result.error("商品没设置供货商品");
		}

		// 过滤不适合的供货商-根据供货商品
		List<SupplyInfo> listFieSupplyInfo = new ArrayList<>();
		List<ItemSupply> listFieItemSupply = new ArrayList<>();
		for (ItemSupply itemSupply : listItemSuppley) {
			if (!itemSupply.getItemStatus().equals(ItemStatusEnum.UP.getCode())) {
				logger.warn("商品没上架-供货商品ID={}, 商品编号={}，状态={}", itemSupply.getId(), itemSupply.getItemNo(), itemSupply.getItemStatus());
				continue;
			}
			if (itemSupply.getCostPrice().compareTo(orderTrade.getSalesPrice()) > 0) {
				logger.warn("商品的成本价大于商品的销售价-供货商品ID={}, 商品编号={}，状态={}", itemSupply.getId(), itemSupply.getItemNo(), itemSupply.getItemStatus());
				continue;
			}
			SupplyInfo supplyInfo = supplyInfoDao.getById(itemSupply.getSupplyInfoId());
			if (ObjectUtils.isEmpty(supplyInfo)) {
				logger.warn("找不到合适的供货商-供货商品ID={}, 商品编号={}，状态={}", itemSupply.getId(), itemSupply.getItemNo(), itemSupply.getItemStatus());
				continue;
			}
			if (!supplyInfo.getStatusId().equals(StatusIdEnum.NORMAL.getCode())) {
				logger.warn("该供货商状态不可用-供货商品ID={}, 商品编号={}，状态={}", itemSupply.getId(), itemSupply.getItemNo(), itemSupply.getItemStatus());
				continue;
			}
			listFieSupplyInfo.add(supplyInfo);
			listFieItemSupply.add(itemSupply);
		}

		if (listFieSupplyInfo.isEmpty() || orderTrade.getSupplyIndex().intValue() + 1 > listFieSupplyInfo.size()) {
			return Result.error("找不到合适的供货商");
		}

		// 获取供货商
		SupplyInfo supplyInfo = listFieSupplyInfo.get(orderTrade.getSupplyIndex().intValue());

		// 交易订单处理
		ItemSupply itemSupply = listFieItemSupply.get(orderTrade.getSupplyIndex().intValue());
		orderTrade.setCostPrice(itemSupply.getCostPrice());
		orderTrade.setItemSupplyId(itemSupply.getId());
		orderTrade.setSupplyCount(orderTrade.getSupplyCount().intValue() + 1);
		orderTrade.setSupplyIndex(orderTrade.getSupplyIndex().intValue() + 1);// 索引加1

		return Result.success(supplyInfo);
	}

	@Override
	public OrderTrade createOrderTrade(String mobile, String orderNo, String orderTime, String notifyUrl, Item item, MerchantInfo merchantInfo) {
		OrderTrade orderTrade = new OrderTrade();
		orderTrade.setOrderStatus(OrderStatusEnum.CREATE.getCode());
		orderTrade.setUserInfoId(merchantInfo.getUserInfoId());
		orderTrade.setAcctInfoId(merchantInfo.getAcctInfoId());
		orderTrade.setItemId(item.getId());
		orderTrade.setItemNo(item.getItemNo());
		orderTrade.setItemName(item.getItemName());
		orderTrade.setItemCategory(item.getItemCategory());
		orderTrade.setItemType(item.getItemType());
		if (merchantInfo.getPriceLevel().equals(PriceLevelEnum.ONE.getCode())) {
			orderTrade.setSalesPrice(item.getSalesPrice1());
		} else if (merchantInfo.getPriceLevel().equals(PriceLevelEnum.TWO.getCode())) {
			orderTrade.setSalesPrice(item.getSalesPrice2());
		} else if (merchantInfo.getPriceLevel().equals(PriceLevelEnum.THREE.getCode())) {
			orderTrade.setSalesPrice(item.getSalesPrice3());
		} else {
			orderTrade.setSalesPrice(item.getSalesPrice1());
		}
		orderTrade.setFacePrice(item.getFacePrice());
		orderTrade.setCostPrice(item.getCostPrice());
		orderTrade.setActualCost(orderTrade.getSalesPrice());
		orderTrade.setMobile(mobile);
		orderTrade.setChannel(ChannelEnum.API.getCode());
		orderTrade.setTradeNo(NOUtil.getTradeNo()); // 平台订单号
		orderTrade.setOrderNo(orderNo);
		orderTrade.setOrderTime(DateUtil.parse(orderTime));
		orderTrade.setCarrierType(item.getCarrierType());
		orderTrade.setSupplyDesc("");
		orderTrade.setSupplyCount(1);
		orderTrade.setSupplyIndex(0);
		orderTrade.setNotifyUrl(notifyUrl);
		orderTrade.setFlowMode(item.getFlowPackageType());
		orderTrade.setFlowScope(item.getFlowScope());
		orderTrade.setCardNo(null);
		orderTrade.setCardPwd(null);
		orderTrade.setRepeatType(RepeatTypeEnum.NO.getCode());
		Long orderTradeId = orderTradeDao.save(orderTrade);
		orderTrade.setId(orderTradeId);
		return orderTrade;
	}

	@Override
	public OrderSupply createOrderSupply(OrderTrade orderTrade, SupplyInfo supplyInfo) {
		OrderSupply orderSupply = new OrderSupply();
		orderSupply.setOrderStatus(OrderStatusEnum.CREATE.getCode());
		orderSupply.setOrderTradeNo(orderTrade.getTradeNo());
		orderSupply.setItemSupplyId(orderTrade.getItemSupplyId());
		orderSupply.setUserInfoId(orderTrade.getUserInfoId());
		orderSupply.setItemId(orderTrade.getItemId());
		orderSupply.setItemCategory(orderTrade.getItemCategory());
		orderSupply.setItemType(orderTrade.getItemType());
		orderSupply.setItemNo(orderTrade.getItemNo());
		orderSupply.setItemName(orderTrade.getItemName());
		orderSupply.setMobile(orderTrade.getMobile());
		orderSupply.setSupplyInfoId(supplyInfo.getId());
		orderSupply.setSupplyCode(supplyInfo.getSupplyCode());
		orderSupply.setSupplyName(supplyInfo.getSupplyName());
		orderSupply.setSupplySerialNo(IdWorker.getId());
		orderSupply.setSupplyFacePrice(orderTrade.getFacePrice());
		orderSupply.setSupplyCostPrice(orderTrade.getCostPrice());
		orderSupply.setSupplyActualCost(orderTrade.getActualCost());
		Long id = orderSupplyDao.save(orderSupply);
		orderSupply.setId(id);
		orderTrade.setSupplySerialNo(orderSupply.getSupplySerialNo());
		return orderSupply;
	}

	@Override
	public Result<OrderTrade> pay(OrderTrade orderTrade) {
		// 创建支付订单
		OrderTradePay orderTradePay = createOrderTradePay(orderTrade);

		// 修改账户金额
		try {
			acctInfoManager.commitBalance(orderTradePay);

			orderTradePay.setPayStatus(PayStatusEnum.SUCCESS.getCode());
			orderTradePayDao.updateById(orderTradePay);

			// 修改订单状态为处理中
			orderTrade.setOrderStatus(OrderStatusEnum.WARTING.getCode());
			orderTradeDao.updateById(orderTrade);
			return Result.success(orderTrade);
		} catch (BaseException e) {
			logger.error("账户异常", e.getMessage());

			// 标记支付订单，交易订单状态为失败
			orderTradePay.setPayStatus(PayStatusEnum.FAIL.getCode());
			orderTradePayDao.updateById(orderTradePay);

			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			orderTradeDao.updateById(orderTrade);
			return Result.error(e.getMessage());
		} catch (Exception e) {
			logger.error("账户异常", e);

			// 标记支付订单，交易订单状态为失败
			orderTradePay.setPayStatus(PayStatusEnum.FAIL.getCode());
			orderTradePayDao.updateById(orderTradePay);

			orderTrade.setOrderStatus(OrderStatusEnum.FAIL.getCode());
			orderTradeDao.updateById(orderTrade);
			return Result.error("账户异常");
		}

	}

	@Override
	public Result<OrderTrade> refund(OrderTrade orderTrade) {
		// 创建支付订单
		OrderTradePay orderTradePay = createOrderTradePayForRefund(orderTrade);

		// 修改账户金额
		try {
			acctInfoManager.commitBalance(orderTradePay);

			orderTradePay.setPayStatus(PayStatusEnum.SUCCESS.getCode());
			orderTradePayDao.updateById(orderTradePay);

			// 修改订单状态为处理中
			orderTrade.setOrderStatus(OrderStatusEnum.WARTING.getCode());
			orderTradeDao.updateById(orderTrade);
			return Result.success(orderTrade);
		} catch (Exception e) {
			logger.error("账户异常", e);

			// 退款异常，标记订单为未确认
			orderTradePay.setPayStatus(PayStatusEnum.UNAFFIRM.getCode());
			orderTradePayDao.updateById(orderTradePay);

			orderTrade.setOrderStatus(OrderStatusEnum.UNAFFIRM.getCode());
			orderTradeDao.updateById(orderTrade);
			return Result.error("账户异常");
		}
	}

	@Override
	public Result<SupplyInfo> getSupplyBySupplyCode(String supplyCode) {
		SupplyInfo supplyInfo = supplyInfoDao.getBySupplyCode(supplyCode);
		if (supplyInfo == null || !supplyInfo.getStatusId().equals(StatusIdEnum.NORMAL.getCode())) {
			return Result.error("找不到代理商");
		}
		return Result.success(supplyInfo);
	}

	@Override
	public OrderTrade getOrderTradeByTradeNo(Long tradeNo) {
		return orderTradeDao.getByTradeNo(tradeNo);
	}

	@Override
	public OrderSupply getOrderSupplyBySupplySerialNo(Long supplySerialNo) {
		return orderSupplyDao.getBySupplySerialNo(supplySerialNo);
	}

	@Override
	public void updateOrderTrade(OrderTrade orderTrade) {
		// 交易订单
		orderTradeDao.updateById(orderTrade);
	}

	@Override
	public void updateOrderSupply(OrderSupply orderSupply) {
		// 供货订单
		orderSupplyDao.updateById(orderSupply);
	}

	@Override
	public void notifyMch(OrderTrade orderTrade) {
		try {
			notifyExecutor.execute(new Runnable() {
				@Override
				public void run() {
					if (null != notifyMsgManagerList) {
						for (NotifyMsgManager notifyManager : notifyMsgManagerList) {
							notifyManager.notifyMsg(orderTrade);
						}
					}
				}
			});
		} catch (RejectedExecutionException e) {
			logger.error("供货线程池达到限额", e);
		}
	}

	/**
	 * 支付订单
	 */
	private OrderTradePay createOrderTradePay(OrderTrade orderTrade) {
		OrderTradePay orderTradePay = new OrderTradePay();
		orderTradePay.setPayStatus(PayStatusEnum.CREATE.getCode());
		orderTradePay.setPaySerialNo(IdWorker.getId());
		orderTradePay.setOrderTradeNo(orderTrade.getTradeNo());
		orderTradePay.setUserInfoId(orderTrade.getUserInfoId());
		orderTradePay.setAcctInfoId(orderTrade.getAcctInfoId());
		orderTradePay.setItemId(orderTrade.getItemId());
		orderTradePay.setItemNo(orderTrade.getItemNo());
		orderTradePay.setTradeType(TradeTypeEnum.SUBTRACT.getCode());
		orderTradePay.setSalesPrice(orderTrade.getSalesPrice());
		orderTradePay.setPayType(PayTypeEnum.BALANCE.getCode());
		Long id = orderTradePayDao.save(orderTradePay);
		orderTradePay.setId(id);
		orderTrade.setPaySerialNo(orderTradePay.getPaySerialNo());
		return orderTradePay;
	}
	
	/**
	 * 退款订单
	 */
	private OrderTradePay createOrderTradePayForRefund(OrderTrade orderTrade) {
		OrderTradePay orderTradePay = new OrderTradePay();
		orderTradePay.setPayStatus(PayStatusEnum.CREATE.getCode());
		orderTradePay.setPaySerialNo(IdWorker.getId());
		orderTradePay.setOrderTradeNo(orderTrade.getTradeNo());
		orderTradePay.setUserInfoId(orderTrade.getUserInfoId());
		orderTradePay.setAcctInfoId(orderTrade.getAcctInfoId());
		orderTradePay.setItemId(orderTrade.getItemId());
		orderTradePay.setItemNo(orderTrade.getItemNo());
		orderTradePay.setTradeType(TradeTypeEnum.ADD.getCode());
		orderTradePay.setSalesPrice(orderTrade.getSalesPrice());
		orderTradePay.setPayType(PayTypeEnum.BALANCE.getCode());
		Long id = orderTradePayDao.save(orderTradePay);
		orderTradePay.setId(id);
		orderTrade.setPaySerialNo(orderTradePay.getPaySerialNo());
		return orderTradePay;
	}

	private MobileInfo getMobileInfoByApi(String mobile) {
		MobileInfo mobileInfo;
		// 这里是demo，并不是真实的接口
		//String result = HttpUtil.get("http://demo.recharge.roncoo.com/getMobinfo.do?mobilenum={mobile}".replace("{mobile}", mobile));
		String result = "18302045627|广东广州|移动";
		// result = 18302045627|广东广州|移动
		String[] results = result.split("\\|");
		AreaInfo areaInfo = getByProvinceAndCity(results[1]);
		mobileInfo = new MobileInfo();
		mobileInfo.setMobilePrefix(results[0].substring(0, 7));
		mobileInfo.setProvinceCode(areaInfo.getProvinceCode());
		mobileInfo.setCityCode(areaInfo.getCityCode());
		mobileInfo.setAreaCode(areaInfo.getAreaCode());
		mobileInfo.setCarrierName(results[2]);
		mobileInfo.setCarrierType(CarrierTypeEnum.getCode(results[2]));
		// 插入到库
		mobileInfoDao.save(mobileInfo);
		return mobileInfo;
	}

	private AreaInfo getByProvinceAndCity(String str) {
		String[] pc = new String[2];
		if (str.contains("黑龙江") || str.contains("内蒙古")) {
			pc[0] = str.substring(0, 3);
			pc[1] = str.substring(3, str.length()).replace("市", "");
		} else {
			pc[0] = str.substring(0, 2);
			pc[1] = str.substring(2, str.length()).replace("市", "");
		}
		return areaInfoDao.getByProvinceAndCity(pc[0], pc[1]);
	}
}
