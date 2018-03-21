/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.SysPlatformQO;
import com.roncoo.recharge.boss.bean.vo.SysPlatformVO;
import com.roncoo.recharge.common.dao.SysPlatformDao;
import com.roncoo.recharge.common.entity.SysPlatform;
import com.roncoo.recharge.common.entity.SysPlatformExample;
import com.roncoo.recharge.common.entity.SysPlatformExample.Criteria;
import com.roncoo.recharge.util.ArrayListUtil;
import com.roncoo.recharge.util.bjui.Page;
import com.roncoo.recharge.util.bjui.PageUtil;
import com.roncoo.recharge.util.enums.StatusIdEnum;
import com.xiaoleilu.hutool.crypto.SecureUtil;

/**
 * 授权客户端表
 *
 * @author wujing
 * @since 2017-12-27
 */
@Component
public class SysPlatformService {

	@Autowired
	private SysPlatformDao dao;

	public Page<SysPlatformVO> listForPage(int pageCurrent, int pageSize, SysPlatformQO qo) {
		SysPlatformExample example = new SysPlatformExample();
		Criteria c = example.createCriteria();
		example.setOrderByClause(" id desc ");
		Page<SysPlatform> page = dao.listForPage(pageCurrent, pageSize, example);
		return PageUtil.transform(page, SysPlatformVO.class);
	}

	public int save(SysPlatformQO qo) {
		SysPlatform record = new SysPlatform();
		BeanUtils.copyProperties(qo, record);
		record.setPlatformAppId("RC" + SecureUtil.simpleUUID());
		record.setPlatformAppSecret(SecureUtil.simpleUUID());
		record.setStatusId(StatusIdEnum.NORMAL.getCode());
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public SysPlatformVO getById(Long id) {
		SysPlatformVO vo = new SysPlatformVO();
		SysPlatform record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(SysPlatformQO qo) {
		SysPlatform record = new SysPlatform();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

	public List<SysPlatformVO> listAll() {
		List<SysPlatform> list = dao.listAll();
		return ArrayListUtil.copy(list, SysPlatformVO.class);
	}

}
