/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.recharge.api.request.BalanceRequest;
import com.roncoo.recharge.api.response.BalanceResponse;
import com.roncoo.recharge.common.dao.AcctInfoDao;
import com.roncoo.recharge.common.dao.MerchantInfoDao;
import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.util.MapObjectUtil;
import com.roncoo.recharge.util.SignUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.ResultEnum;
import com.roncoo.recharge.util.enums.StatusIdEnum;
import com.xiaoleilu.hutool.util.ObjectUtil;

@Service
public class BalanceService extends BaseRoncoo {

	@Autowired
	private MerchantInfoDao merchantInfoDao;

	@Autowired
	private AcctInfoDao acctInfoDao;

	public Result<BalanceResponse> balanceQuery(BalanceRequest balanceRequest) {
		// 商户校验
		Result<MerchantInfo> resultMch = checkMch(balanceRequest.getAppId());
		if (!resultMch.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return Result.error(resultMch.getCode(), resultMch.getMsg());
		}
		MerchantInfo merchantInfo = resultMch.getData();

		// 参数sign校验
		if (!SignUtil.checkSign(MapObjectUtil.Obj2Map(balanceRequest), merchantInfo.getAppSeceret())) {
			return Result.error("sign不正确");
		}

		AcctInfo acctInfo = acctInfoDao.getById(merchantInfo.getAcctInfoId());
		if (null == acctInfo) {
			return Result.error("没该账号信息");
		}

		return Result.success(getQueryBalance(acctInfo));
	}

	private BalanceResponse getQueryBalance(AcctInfo acctInfo) {
		BalanceResponse balanceResponse = new BalanceResponse();
		balanceResponse.setTotalBalance(acctInfo.getTotalBalance());
		return balanceResponse;
	}

	private Result<MerchantInfo> checkMch(String appId) {
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

}
