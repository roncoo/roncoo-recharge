/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roncoo.recharge.boss.bean.vo.SysMenuVO;
import com.roncoo.recharge.boss.service.SysMenuService;
import com.roncoo.recharge.util.ConfigUtil;
import com.roncoo.recharge.util.Constants;
import com.roncoo.recharge.util.JSONUtil;
import com.roncoo.recharge.util.exception.BaseException;

@Controller
public class IndexController {

	@Autowired
	private SysMenuService sysMenuService;

	@RequestMapping("/index")
	public void index(ModelMap modelMap) {
		Long userInfoId = Long.valueOf(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.USER_ID).toString());
		List<SysMenuVO> menuVOList = sysMenuService.listMenuByUserInfoIdAndPlatformAppId(userInfoId, ConfigUtil.PLATFORM_APPID);
		if (menuVOList == null || menuVOList.isEmpty()) {
			throw new BaseException("没权限");
		}
		modelMap.put("menuList", menuVOList);
		SecurityUtils.getSubject().getSession(false).setAttribute(Constants.Session.MENU, JSONUtil.toJSONString(menuVOList));
	}

	@RequestMapping("/context")
	public void context(ModelMap modelMap) {
		modelMap.put("javaVersion", System.getProperty("java.version"));
		modelMap.put("osName", System.getProperty("os.name"));
	}

}
