/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roncoo.recharge.boss.bean.qo.SysRoleUserQO;
import com.roncoo.recharge.boss.bean.vo.SysRoleUserVO;
import com.roncoo.recharge.boss.service.SysPlatformService;
import com.roncoo.recharge.boss.service.SysRoleService;
import com.roncoo.recharge.boss.service.SysRoleUserService;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.enums.StatusIdEnum;

/**
 * 角色用户关联表
 *
 * @author wujing
 * @since 2017-12-26
 */
@Controller
@RequestMapping(value = "/admin/sysRoleUser")
public class SysRoleUserController extends BaseController {

	private final static String TARGETID = "admin-sysRoleUser";

	@Autowired
	private SysRoleUserService service;

	@Autowired
	private SysRoleService sysRoleService;

	@Autowired
	private SysPlatformService sysPlatformService;

	@RequestMapping(value = "/set")
	public void set(@ModelAttribute SysRoleUserQO qo, ModelMap modelMap) {
		List<SysRoleUserVO> list = service.listByUserInfoId(qo.getUserInfoId());
		modelMap.put("roleUserList", list);
		modelMap.put("roleList", sysRoleService.listRoleForUserInfo(qo, list, qo.getUserInfoId()));
		modelMap.put("bean", qo);
		modelMap.put("sysPlatformList", sysPlatformService.listAll());
	}

	@ResponseBody
	@RequestMapping(value = "/save")
	public String save(@ModelAttribute SysRoleUserQO qo, @RequestParam(value = "ids") String ids) {
		if (service.save(qo, ids) > 0) {
			return success(TARGETID);
		}
		return error("添加失败");
	}
	
	@ModelAttribute
	public void enums(ModelMap modelMap) {
		modelMap.put("statusIdEnums", StatusIdEnum.values());
	}

}
