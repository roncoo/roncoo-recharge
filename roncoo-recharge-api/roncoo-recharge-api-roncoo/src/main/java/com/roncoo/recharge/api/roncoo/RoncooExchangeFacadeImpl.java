/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.api.roncoo;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.RejectedExecutionException;

import org.springframework.stereotype.Service;

import com.roncoo.recharge.api.bo.BalanceBO;
import com.roncoo.recharge.api.bo.ExchangeBO;
import com.roncoo.recharge.api.bo.ExchangeNotifyBO;
import com.roncoo.recharge.api.bo.ExchangeOrderBO;
import com.roncoo.recharge.api.dto.BalanceDTO;
import com.roncoo.recharge.api.dto.ExchangeDTO;
import com.roncoo.recharge.api.dto.ExchangeNotifyDTO;
import com.roncoo.recharge.api.dto.ExchangeOrderDTO;
import com.roncoo.recharge.api.facade.BalanceFacade;
import com.roncoo.recharge.api.facade.ExchangeFacade;
import com.roncoo.recharge.util.HttpRestUtil;
import com.roncoo.recharge.util.SignUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.enums.TradeStatusEnum;
import com.xiaoleilu.hutool.date.DateUtil;

/**
 * 兑换模拟接口
 */
@Service("roncooduihuan")
public class RoncooExchangeFacadeImpl extends BaseRoncoo implements ExchangeFacade, BalanceFacade {

	@Override
	public ExchangeDTO exchange(ExchangeBO exchangeBO) {
		ExchangeDTO dto = new ExchangeDTO();
		dto.setTradeStatusEnum(TradeStatusEnum.SUCCESS);

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
					map.put("serialNo", exchangeBO.getSupplySerialNo());
					map.put("status", 1);
					map.put("tradeTime", DateUtil.format(new Date(), "yyyyMMddHHmmssSSS"));
					map.put("sign", SignUtil.getSign(map, "6bdef1a23d5c466cadf51dccd651f7ba"));
					String result = HttpRestUtil.postForObject(exchangeBO.getNotifyUrl(), map, String.class);
					logger.warn("兑换业务-通知下游：返回报文={}", result);
				}
			});
		} catch (RejectedExecutionException e) {
			logger.error("供货线程池达到限额", e);
		}
		return dto;
	}

	@Override
	public ExchangeNotifyDTO verify(ExchangeNotifyBO exchangeNotifyBO) {
		Map<String, Object> map = exchangeNotifyBO.getParamMap();
		logger.warn("上游回调返回参数={}", map);

		// 校验

		// 封装
		ExchangeNotifyDTO dto = new ExchangeNotifyDTO();
		dto.setSupplySerialNo(Long.valueOf(map.get("serialNo").toString()));
		if ("1".equals(map.get("status").toString())) {
			dto.setTradeStatusEnum(TradeStatusEnum.SUCCESS);
			dto.setReturnMsg("成功");
		} else {
			dto.setTradeStatusEnum(TradeStatusEnum.FAIL);
			dto.setReturnMsg("成功");
			dto.setErrorMsg("交易失败");
		}
		return dto;
	}

	@Override
	public ExchangeOrderDTO order(ExchangeOrderBO exchangeOrderBO) {
		return new ExchangeOrderDTO();
	}

	@Override
	public BalanceDTO balance(BalanceBO balanceBO) {
		return new BalanceDTO();
	}

}
