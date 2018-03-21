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

import com.roncoo.recharge.boss.bean.qo.ItemQO;
import com.roncoo.recharge.boss.bean.vo.AreaInfoVO;
import com.roncoo.recharge.boss.service.AreaInfoService;
import com.roncoo.recharge.boss.service.ItemService;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.enums.CarrierTypeEnum;
import com.roncoo.recharge.util.enums.FlowPackageTypeEnum;
import com.roncoo.recharge.util.enums.FlowScopeEnum;
import com.roncoo.recharge.util.enums.FlowStreamTypeEnum;
import com.roncoo.recharge.util.enums.ItemCategoryEnum;
import com.roncoo.recharge.util.enums.ItemStatusEnum;
import com.roncoo.recharge.util.enums.ItemTypeEnum;

/**
 * 商品管理
 *
 * @author wujing
 * @since 2017-12-19
 */
@Controller
@RequestMapping(value = "/admin/item")
public class ItemController extends BaseController {

	private final static String TARGETID = "admin-item";

	@Autowired
	private ItemService service;
	@Autowired
	private AreaInfoService areaInfoService;
	
	@RequestMapping(value = "/list")
	public void list(@RequestParam(value = "pageCurrent", defaultValue = "1") int pageCurrent, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize, @ModelAttribute ItemQO qo, ModelMap modelMap) {
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
	public String save(@ModelAttribute ItemQO qo) {
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
	public String update(@ModelAttribute ItemQO qo) {
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
		modelMap.put("carrierTypeEnums", CarrierTypeEnum.values());
		modelMap.put("itemTypeEnums", ItemTypeEnum.values());
		modelMap.put("itemStatusEnums", ItemStatusEnum.values());
		modelMap.put("flowScopeEnums", FlowScopeEnum.values());
		modelMap.put("flowPackageTypeEnums", FlowPackageTypeEnum.values());
		modelMap.put("flowStreamTypeEnums", FlowStreamTypeEnum.values());
		modelMap.put("itemCategoryEnums", ItemCategoryEnum.values());
	}

	@ModelAttribute("salesAreaList")
	public List<AreaInfoVO> salesAreaList() {
		return areaInfoService.listByProvince();
	}
}
