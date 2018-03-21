/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.roncoo;

import java.util.Date;
import java.util.TreeMap;
import java.util.concurrent.RejectedExecutionException;

import org.springframework.stereotype.Service;

import com.roncoo.recharge.api.bo.BalanceBO;
import com.roncoo.recharge.api.bo.RechargeBO;
import com.roncoo.recharge.api.bo.RechargeNotifyBO;
import com.roncoo.recharge.api.bo.RechargeOrderBO;
import com.roncoo.recharge.api.dto.BalanceDTO;
import com.roncoo.recharge.api.dto.RechargeDTO;
import com.roncoo.recharge.api.dto.RechargeNotifyDTO;
import com.roncoo.recharge.api.dto.RechargeOrderDTO;
import com.roncoo.recharge.api.facade.BalanceFacade;
import com.roncoo.recharge.api.facade.RechargeFacade;
import com.roncoo.recharge.util.HttpRestUtil;
import com.roncoo.recharge.util.SignUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.enums.TradeStatusEnum;
import com.xiaoleilu.hutool.date.DateUtil;

/**
 * 充值模拟接口
 */
@Service("roncoochongzhi")
public class RoncooRechargeFacadeImpl extends BaseRoncoo implements RechargeFacade, BalanceFacade {

	@Override
	public RechargeDTO recharge(RechargeBO rechargeBO) {
		RechargeDTO rechargeDTO = new RechargeDTO();
		rechargeDTO.setTradeStatusEnum(TradeStatusEnum.SUCCESS);
		rechargeDTO.setSupplySerialNo(Long.valueOf(rechargeBO.getSupplySerialNo()));
		rechargeDTO.setMobile(rechargeBO.getMobile());

		// 回调上游
		try {
			notifyExecutor.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(100L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					TreeMap<String, Object> map = new TreeMap<>();
					map.put("serialNo", rechargeBO.getSupplySerialNo());
					map.put("status", 1);
					map.put("tradeTime", DateUtil.format(new Date(), "yyyyMMddHHmmssSSS"));
					map.put("sign", SignUtil.getSign(map, "6bdef1a23d5c466cadf51dccd651f7ba"));
					String result = HttpRestUtil.postForObject(rechargeBO.getNotifyUrl(), map, String.class);
					logger.warn("充值业务-通知下游：返回报文={}", result);
				}
			});
		} catch (RejectedExecutionException e) {
			logger.error("供货线程池达到限额", e);
		}
		return rechargeDTO;
	}

	@Override
	public RechargeNotifyDTO verify(RechargeNotifyBO rechargeNotifyBO) {
		RechargeNotifyDTO dto = new RechargeNotifyDTO();
		TreeMap<String, Object> paramMap = rechargeNotifyBO.getParamMap();
		if ("1".equals(paramMap.get("status").toString())) {
			dto.setTradeStatusEnum(TradeStatusEnum.SUCCESS);
		}
		dto.setSupplySerialNo(Long.valueOf(paramMap.get("serialNo").toString()));
		dto.setReturnMsg("success");
		return dto;
	}

	@Override
	public RechargeOrderDTO order(RechargeOrderBO rechargeOrderBO) {
		return new RechargeOrderDTO();
	}

	@Override
	public BalanceDTO balance(BalanceBO balanceBO) {
		return new BalanceDTO();
	}

}
