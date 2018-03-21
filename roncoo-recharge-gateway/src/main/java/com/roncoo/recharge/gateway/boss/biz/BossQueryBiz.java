/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.boss.biz;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.recharge.api.bo.BalanceBO;
import com.roncoo.recharge.api.bo.ExchangeOrderBO;
import com.roncoo.recharge.api.bo.RechargeOrderBO;
import com.roncoo.recharge.api.dto.BalanceDTO;
import com.roncoo.recharge.api.dto.ExchangeOrderDTO;
import com.roncoo.recharge.api.dto.RechargeOrderDTO;
import com.roncoo.recharge.api.facade.BalanceFacade;
import com.roncoo.recharge.api.facade.ExchangeFacade;
import com.roncoo.recharge.api.facade.RechargeFacade;
import com.roncoo.recharge.common.dao.SupplyInfoDao;
import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.gateway.service.manager.RechargeManager;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.StatusIdEnum;
import com.roncoo.recharge.util.enums.TradeStatusEnum;
import com.xiaoleilu.hutool.util.ObjectUtil;

@Service
public class BossQueryBiz extends BaseRoncoo {

	@Autowired
	private RechargeManager rechargeManager;

	@Autowired
	private SupplyInfoDao supplyInfoDao;

	@Autowired(required = false)
	private Map<String, BalanceFacade> facadeBalance;

	@Autowired(required = false)
	private Map<String, ExchangeFacade> facadeExchange;

	@Autowired(required = false)
	private Map<String, RechargeFacade> facadeRecharge;

	public Result<ExchangeOrderDTO> exchangeOrder(Long supplySerialNo) {
		OrderSupply orderSupply = rechargeManager.getOrderSupplyBySupplySerialNo(supplySerialNo);
		if (ObjectUtil.isNull(orderSupply)) {
			return Result.error("供货订单不存在");
		}

		ExchangeFacade exchangeFacade = facadeExchange.get(orderSupply.getSupplyCode());
		ExchangeOrderBO exchangeOrderBO = new ExchangeOrderBO();
		exchangeOrderBO.setTradeNo(orderSupply.getOrderTradeNo());
		exchangeOrderBO.setSerialNo(orderSupply.getSupplySerialNo());
		return Result.success(exchangeFacade.order(exchangeOrderBO));
	}

	public Result<RechargeOrderDTO> rechargeOrder(Long supplySerialNo) {
		OrderSupply orderSupply = rechargeManager.getOrderSupplyBySupplySerialNo(supplySerialNo);
		if (ObjectUtil.isNull(orderSupply)) {
			return Result.error("供货订单不存在");
		}

		RechargeFacade rechargeFacade = facadeRecharge.get(orderSupply.getSupplyCode());
		RechargeOrderBO rechargeOrderBO = new RechargeOrderBO();
		rechargeOrderBO.setTradeNo(orderSupply.getOrderTradeNo());
		rechargeOrderBO.setSerialNo(orderSupply.getSupplySerialNo());
		return Result.success(rechargeFacade.order(rechargeOrderBO));
	}

	public Result<String> queryBalance(String supplyCode) {
		SupplyInfo supplyInfo = supplyInfoDao.getBySupplyCode(supplyCode);
		if (supplyInfo == null || !supplyInfo.getStatusId().equals(StatusIdEnum.NORMAL.getCode())) {
			return Result.error("找不到供货商");
		}
		BalanceBO balanceBO = new BalanceBO();
		BeanUtils.copyProperties(supplyInfo, balanceBO);
		BalanceFacade balanceFacade = facadeBalance.get(supplyCode);
		BalanceDTO result = balanceFacade.balance(balanceBO);
		if (null == result) {
			return Result.error("接口不支持余额查询");
		}
		if (result.getTradeStatusEnum().equals(TradeStatusEnum.FAIL)) {
			return Result.error(result.getErrorMsg());
		}
		return Result.success(result.getBalance());
	}

}
