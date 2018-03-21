/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roncoo.recharge.boss.bean.qo.SysMenuQO;
import com.roncoo.recharge.boss.service.SysMenuService;
import com.roncoo.recharge.boss.service.SysPlatformService;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.enums.StatusIdEnum;

/**
 * 菜单信息
 *
 * @author wujing
 * @since 2017-12-26
 */
@Controller
@RequestMapping(value = "/admin/sysMenu")
public class SysMenuController extends BaseController {

	private final static String TARGETID = "admin-sysMenu";

	@Autowired
	private SysMenuService service;

	@Autowired
	private SysPlatformService sysPlatformService;

	/**
	 * 菜单列出
	 */
	@RequestMapping("/list")
	public void list(@ModelAttribute SysMenuQO qo, ModelMap modelMap) {
		modelMap.put("list", service.listAll(qo));
		modelMap.put("bean", qo);
		modelMap.put("sysPlatformList", sysPlatformService.listAll());
	}

	@RequestMapping(value = "/add")
	public void add(@ModelAttribute SysMenuQO qo, ModelMap modelMap) {
		modelMap.put("bean", qo);
		modelMap.put("sysPlatformList", sysPlatformService.listAll());
	}

	@ResponseBody
	@RequestMapping(value = "/save")
	public String save(@ModelAttribute SysMenuQO qo) {
		if (service.save(qo) > 0) {
			return success(TARGETID);
		}
		return error("添加失败");
	}

	@ResponseBody
	@RequestMapping(value = "/save/sub")
	public Long saveSub(@ModelAttribute SysMenuQO qo) {
		return service.save(qo);
	}

	@ResponseBody
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam(value = "id") Long id) {
		int result = service.deleteById(id);
		if (result > 0) {
			return delete(TARGETID);
		} else if (result == -1) {
			return error("删除失败，请先删除子菜单");
		}
		return error("删除失败");
	}

	@RequestMapping(value = "/edit")
	public void edit(@RequestParam(value = "id") Long id, ModelMap modelMap) {
		modelMap.put("bean", service.getById(id));
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(@ModelAttribute SysMenuQO qo) {
		if (service.updateById(qo) > 0) {
			return success(TARGETID);
		}
		return error("修改失败");
	}

	@RequestMapping(value = "/view")
	public void view(@RequestParam(value = "id") Long id, ModelMap modelMap) {
		modelMap.put("bean", service.getById(id));
	}

	@ModelAttribute
	public void enums(ModelMap modelMap) {
		modelMap.put("statusIdEnums", StatusIdEnum.values());
	}

}
