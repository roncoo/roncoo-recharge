/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.manager.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.roncoo.recharge.common.dao.AcctInfoDao;
import com.roncoo.recharge.common.dao.AcctLogDao;
import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.AcctLog;
import com.roncoo.recharge.common.entity.OrderTradePay;
import com.roncoo.recharge.common.manager.AcctInfoManager;
import com.roncoo.recharge.util.VCUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.enums.BillStatusEnum;
import com.roncoo.recharge.util.enums.BillTypeEnum;
import com.roncoo.recharge.util.enums.StatusIdEnum;
import com.roncoo.recharge.util.enums.TradeTypeEnum;
import com.roncoo.recharge.util.exception.BaseException;

@Component
public class AcctInfoManagerImpl extends BaseRoncoo implements AcctInfoManager {

	@Autowired
	private AcctInfoDao acctInfoDao;
	@Autowired
	private AcctLogDao acctLogDao;

	/**
	 * 事务操作
	 */
	@Override
	@Transactional
	public AcctInfo commitBalance(OrderTradePay orderTradePay) {
		AcctInfo acctInfo = acctInfoDao.getByIdForUpdate(orderTradePay.getAcctInfoId());
		// 注意：抛出异常才会执行 rollback 释放掉上面的锁

		// 账户校验
		if (!acctInfo.getStatusId().equals(StatusIdEnum.NORMAL.getCode())) {
			throw new BaseException("无法交易，账户被冻结");
		}

		if (!VCUtil.checkVC(acctInfo.getVerificationCode(), acctInfo.getTotalBalance(), acctInfo.getLastTradeBalance())) {
			throw new BaseException("无法交易，账户异常");
		}

		Long totalBalance = 0L;
		if (orderTradePay.getTradeType().equals(TradeTypeEnum.ADD.getCode())) {
			// 增加
			totalBalance = acctInfo.getTotalBalance() + orderTradePay.getSalesPrice();
		} else if (orderTradePay.getTradeType().equals(TradeTypeEnum.SUBTRACT.getCode())) {
			// 金额处理
			totalBalance = acctInfo.getTotalBalance() - orderTradePay.getSalesPrice();
			if (totalBalance < 0) {
				logger.warn("账户余额不足：acctInfoId={}, paySerialNo={}", acctInfo.getId(), orderTradePay.getPaySerialNo());
				throw new BaseException("账户余额不足");
			}
		} else {
			logger.error("未知交易类型");
			throw new BaseException("无法交易，数据异常");
		}

		// 更新账户
		updateAcctInfo(acctInfo, totalBalance);

		// 创建账户记录
		Long acctLogId = saveAcctLog(orderTradePay, acctInfo);
		orderTradePay.setAcctLogId(acctLogId);

		return acctInfo;
	}

	private Long saveAcctLog(OrderTradePay orderTradePay, AcctInfo acctInfo) {
		AcctLog acctLog = new AcctLog();
		acctLog.setUserInfoId(acctInfo.getUserInfoId());
		acctLog.setAcctInfoId(acctInfo.getId());
		acctLog.setBillType(BillTypeEnum.PAY.getCode());
		acctLog.setBillStatus(BillStatusEnum.SUCCESS.getCode());
		acctLog.setTradeType(orderTradePay.getTradeType());
		acctLog.setPaySerialNo(orderTradePay.getPaySerialNo());
		acctLog.setAmount(orderTradePay.getSalesPrice());
		acctLog.setTotalBalance(acctInfo.getTotalBalance());
		return acctLogDao.save(acctLog);
	}

	private void updateAcctInfo(AcctInfo acctInfo, Long totalBalance) {
		acctInfo.setLastTradeBalance(acctInfo.getTotalBalance());
		acctInfo.setLastTradeDate(new Date());
		acctInfo.setTotalBalance(totalBalance);
		acctInfo.setVerificationCode(VCUtil.getVC(acctInfo.getTotalBalance(), acctInfo.getLastTradeBalance()));
		acctInfoDao.updateById(acctInfo);
	}

}
