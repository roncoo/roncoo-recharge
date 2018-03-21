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

import com.roncoo.recharge.boss.bean.qo.ItemSupplyQO;
import com.roncoo.recharge.boss.service.ItemService;
import com.roncoo.recharge.boss.service.ItemSupplyService;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.enums.ItemStatusEnum;
import com.roncoo.recharge.util.enums.LossTypeEnum;

/**
 * 供应商商品管理
 *
 * @author wujing
 * @since 2017-12-19
 */
@Controller
@RequestMapping(value = "/admin/itemSupply")
public class ItemSupplyController extends BaseController {

	private final static String TARGETID = "admin-itemSupply";

	@Autowired
	private ItemSupplyService service;

	@Autowired
	private ItemService itemService;

	@ResponseBody
	@RequestMapping(value = "/set")
	public String set(@ModelAttribute ItemSupplyQO qo) {
		if (service.save(qo) > 0) {
			return success(TARGETID);
		}
		return error("添加失败");
	}

	// 关联供货商
	@RequestMapping(value = "/relevance")
	public void itemSupplyAdd(@RequestParam(value = "id") Long id, ModelMap modelMap) {
		modelMap.put("item", itemService.getById(id)); // 商品信息
	}

	@RequestMapping(value = "/list")
	public void list(@RequestParam(value = "pageCurrent", defaultValue = "1") int pageCurrent, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize, @ModelAttribute ItemSupplyQO qo, ModelMap modelMap) {
		modelMap.put("page", service.listForPage(pageCurrent, pageSize, qo));
		modelMap.put("pageCurrent", pageCurrent);
		modelMap.put("pageSize", pageSize);
		modelMap.put("bean", qo);
	}

	@RequestMapping(value = "/add")
	public void add() {

	}

	@ResponseBody
	@RequestMapping(value = "/save")
	public String save(@ModelAttribute ItemSupplyQO qo) {
		if (service.save(qo) > 0) {
			return success(TARGETID);
		}
		return error("添加失败");
	}

	@ResponseBody
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam(value = "id") Long id) {
		if (service.deleteById(id) > 0) {
			return delete(TARGETID);
		}
		return error("删除失败");
	}

	@RequestMapping(value = "/edit")
	public void edit(@RequestParam(value = "id") Long id, ModelMap modelMap) {
		modelMap.put("bean", service.getById(id));
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(@ModelAttribute ItemSupplyQO qo) {
		if (service.updateById(qo) > 0) {
			return success(TARGETID);
		}
		return error("修改失败");
	}
	
	@ResponseBody
	@RequestMapping(value = "/status")
	public String status(@ModelAttribute ItemSupplyQO qo) {
		if (service.statusById(qo) > 0) {
			return ties(TARGETID);
		}
		return error("修改失败");
	}

	@RequestMapping(value = "/view")
	public void view(@RequestParam(value = "id") Long id, ModelMap modelMap) {
		modelMap.put("bean", service.getById(id));
	}
	
	@ModelAttribute
	public void enums(ModelMap modelMap) {
		modelMap.put("itemStatusEnums", ItemStatusEnum.values());
		modelMap.put("lossTypeEnums", LossTypeEnum.values());
	}

}
