/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.roncoo.recharge.boss.bean.qo.SysMenuRoleQO;
import com.roncoo.recharge.boss.bean.vo.SysMenuRoleVO;
import com.roncoo.recharge.common.dao.SysMenuRoleDao;
import com.roncoo.recharge.common.entity.SysMenuRole;
import com.roncoo.recharge.util.ArrayListUtil;

/**
 * 菜单角色关联表
 *
 * @author wujing
 * @since 2017-12-26
 */
@Component
public class SysMenuRoleService {

	@Autowired
	private SysMenuRoleDao dao;

	public List<SysMenuRoleVO> listByRoleId(Long roleId) {
		List<SysMenuRole> list = dao.listByRoleId(roleId);
		return ArrayListUtil.copy(list, SysMenuRoleVO.class);
	}

	public int save(SysMenuRoleQO qo, String ids) {
		if (StringUtils.hasText(ids)) {
			dao.deleteByRoleId(qo.getRoleId());
			String[] menuIds = ids.split(",");
			for (String id : menuIds) {
				SysMenuRole entity = new SysMenuRole();
				entity.setMenuId(Long.valueOf(id));
				entity.setRoleId(qo.getRoleId());
				entity.setPlatformId(qo.getPlatformId());
				dao.save(entity);
			}
		}
		return 1;
	}

}
