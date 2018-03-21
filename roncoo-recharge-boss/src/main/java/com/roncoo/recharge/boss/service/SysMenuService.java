/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.boss.bean.qo.SysMenuQO;
import com.roncoo.recharge.boss.bean.vo.SysMenuRoleVO;
import com.roncoo.recharge.boss.bean.vo.SysMenuVO;
import com.roncoo.recharge.common.dao.SysMenuDao;
import com.roncoo.recharge.common.dao.SysMenuRoleDao;
import com.roncoo.recharge.common.dao.SysPlatformDao;
import com.roncoo.recharge.common.dao.SysRoleUserDao;
import com.roncoo.recharge.common.entity.SysMenu;
import com.roncoo.recharge.common.entity.SysMenuRole;
import com.roncoo.recharge.common.entity.SysPlatform;
import com.roncoo.recharge.common.entity.SysRoleUser;
import com.roncoo.recharge.util.ArrayListUtil;
import com.xiaoleilu.hutool.util.ObjectUtil;

/**
 * 菜单信息
 *
 * @author wujing
 * @since 2017-12-26
 */
@Component
public class SysMenuService {

	@Autowired
	private SysMenuDao dao;

	@Autowired
	private SysPlatformDao sysPlatformDao;

	@Autowired
	private SysRoleUserDao sysRoleUserDao;

	@Autowired
	private SysMenuRoleDao sysMenuRoleDao;

	public Long save(SysMenuQO qo) {
		SysMenu record = new SysMenu();
		BeanUtils.copyProperties(qo, record);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		List<SysMenu> list = dao.listByParentId(id);
		if (!list.isEmpty()) {
			return -1;
		}
		return dao.deleteById(id);
	}

	public SysMenuVO getById(Long id) {
		SysMenuVO vo = new SysMenuVO();
		SysMenu record = dao.getById(id);
		BeanUtils.copyProperties(record, vo);
		return vo;
	}

	public int updateById(SysMenuQO qo) {
		SysMenu record = new SysMenu();
		BeanUtils.copyProperties(qo, record);
		return dao.updateById(record);
	}

	public List<SysMenuVO> listAll(SysMenuQO qo) {
		if (null == qo.getPlatformId()) {
			return null;
		}
		List<SysMenu> list = dao.listByPlatformId(qo.getPlatformId());
		return ArrayListUtil.copy(list, SysMenuVO.class);
	}

	public List<SysMenuVO> listMenuForRole(List<SysMenuRoleVO> sysMenuRoleVolist, Long platformId) {
		List<SysMenuVO> sysMenuVoList = recursion(0L, platformId);
		checkMenu(sysMenuVoList, sysMenuRoleVolist);
		return sysMenuVoList;
	}

	/**
	 * 递归获取菜单(角色关联菜单)
	 */
	private List<SysMenuVO> recursion(Long parentId, Long platformId) {
		List<SysMenuVO> lists = new ArrayList<>();
		List<SysMenu> list = dao.listByParentIdAndPlatformId(parentId, platformId);
		if (!list.isEmpty()) {
			for (SysMenu m : list) {
				SysMenuVO vo = new SysMenuVO();
				BeanUtils.copyProperties(m, vo);
				vo.setList(recursion(m.getId(), platformId));
				lists.add(vo);
			}
		}
		return lists;
	}

	private List<SysMenuVO> checkMenu(List<SysMenuVO> sysMenuVoList, List<SysMenuRoleVO> sysMenuRoleVolist) {
		for (SysMenuVO mv : sysMenuVoList) {
			Integer isShow = 0;
			for (SysMenuRoleVO vo : sysMenuRoleVolist) {
				if (mv.getId().equals(vo.getMenuId())) {
					isShow = 1;
					break;
				}
			}
			mv.setIsShow(isShow);
			checkMenu(mv.getList(), sysMenuRoleVolist);
		}
		return sysMenuVoList;
	}

	public List<SysMenuVO> listMenuByUserInfoIdAndPlatformAppId(Long userInfoId, String platformAppid) {
		SysPlatform sysPlatform = sysPlatformDao.getByPlatformAppid(platformAppid);
		List<SysRoleUser> roleUserList = sysRoleUserDao.listByUserInfoIdAndPlatformId(userInfoId, sysPlatform.getId());

		List<SysMenuRole> sysMenuRoleList = new ArrayList<>();
		if (!roleUserList.isEmpty()) {
			for (SysRoleUser sysRoleUser : roleUserList) {
				sysMenuRoleList.addAll(sysMenuRoleDao.listByRoleId(sysRoleUser.getRoleId()));
			}
		}

		return listMenucByRoleAndPlatformId(sysMenuRoleList, sysPlatform.getId());
	}

	private List<SysMenuVO> listMenucByRoleAndPlatformId(List<SysMenuRole> sysMenuRoleList, Long platformId) {
		List<SysMenuVO> list = recursion(0L, platformId);
		List<SysMenuVO> sysMenuVOList = new ArrayList<>();
		sysMenuVOList = listMenu(sysMenuVOList, sysMenuRoleList, list);
		return sysMenuVOList;
	}

	private List<SysMenuVO> listMenu(List<SysMenuVO> sysMenuVOList, List<SysMenuRole> sysMenuRoleList, List<SysMenuVO> list) {
		for (SysMenuVO mv : list) {
			SysMenuVO v = null;
			for (SysMenuRole vo : sysMenuRoleList) {
				if (mv.getId().equals(vo.getMenuId())) {
					v = new SysMenuVO();
					BeanUtils.copyProperties(mv, v);
					break;
				}
			}
			if (ObjectUtil.isNotNull(v)) {
				sysMenuVOList.add(v);
				List<SysMenuVO> l = new ArrayList<>();
				if (v != null) {
					v.setList(l);
				}
				listMenu(l, sysMenuRoleList, mv.getList());
			}
		}
		return sysMenuVOList;
	}

}
