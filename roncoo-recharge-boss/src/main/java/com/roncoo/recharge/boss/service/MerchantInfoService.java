/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.roncoo.recharge.boss.bean.qo.MerchantInfoQO;
import com.roncoo.recharge.boss.bean.vo.MerchantInfoVO;
import com.roncoo.recharge.common.dao.AcctInfoDao;
import com.roncoo.recharge.common.dao.MerchantInfoDao;
import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.MerchantInfoExample;
import com.roncoo.recharge.common.entity.MerchantInfoExample.Criteria;
import com.roncoo.recharge.util.VCUtil;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.util.enums.StatusIdEnum;
import com.xiaoleilu.hutool.crypto.SecureUtil;

/**
 * 商户信息
 *
 * @author wujing
 * @since 2017-12-22
 */
@Component
public class MerchantInfoService {

	@Autowired
	private MerchantInfoDao dao;
	@Autowired
	private AcctInfoDao acctInfoDao;

	public Page<MerchantInfoVO> listForPage(int pageCurrent, int pageSize, MerchantInfoQO qo) {
		MerchantInfoExample example = new MerchantInfoExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<MerchantInfo> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, MerchantInfoVO.class);
	}

	/**
	 * 添加商户，同时添加账户
	 */
	@Transactional
	public int save(MerchantInfoQO qo) {
		AcctInfo acctInfo = new AcctInfo();
		acctInfo.setStatusId(StatusIdEnum.NORMAL.getCode());
		acctInfo.setUserInfoId(qo.getUserInfoId());
		acctInfo.setTotalBalance(0L);
		acctInfo.setLastTradeBalance(0L);
		acctInfo.setLastTradeDate(new Date());
		acctInfo.setVerificationCode(VCUtil.getVC(acctInfo.getTotalBalance(), acctInfo.getLastTradeBalance()));
		acctInfoDao.save(acctInfo);
		acctInfo = acctInfoDao.getByUserInfoId(qo.getUserInfoId());

		MerchantInfo record = new MerchantInfo();
		BeanUtils.copyProperties(qo, record);
		record.setAppId("RC" + SecureUtil.simpleUUID());
		record.setAppSeceret(SecureUtil.simpleUUID());
		record.setAcctInfoId(acctInfo.getId());

		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public MerchantInfoVO getById(Long id) {
		MerchantInfoVO vo = new MerchantInfoVO();
		MerchantInfo record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		AcctInfo acctInfo = acctInfoDao.getById(record.getAcctInfoId());
		vo.setTotalBalance(acctInfo.getTotalBalance());
		return vo;
	}

	public int updateById(MerchantInfoQO qo) {
		MerchantInfo record = new MerchantInfo();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

}
