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

import com.roncoo.recharge.boss.bean.qo.OrderTradeQO;
import com.roncoo.recharge.boss.service.OrderTradeService;
import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.CarrierTypeEnum;
import com.roncoo.recharge.util.enums.ChannelEnum;
import com.roncoo.recharge.util.enums.FlowModeEnum;
import com.roncoo.recharge.util.enums.FlowPackageTypeEnum;
import com.roncoo.recharge.util.enums.FlowScopeEnum;
import com.roncoo.recharge.util.enums.FlowStreamTypeEnum;
import com.roncoo.recharge.util.enums.ItemCategoryEnum;
import com.roncoo.recharge.util.enums.ItemTypeEnum;
import com.roncoo.recharge.util.enums.OrderStatusEnum;
import com.roncoo.recharge.util.enums.ResultEnum;

/**
 * 交易订单
 *
 * @author wujing
 * @since 2017-12-19
 */
@Controller
@RequestMapping(value = "/admin/orderTrade")
public class OrderTradeController extends BaseController {

	private final static String TARGETID = "admin-orderTrade";

	@Autowired
	private OrderTradeService service;

	/**
	 * 补通知功能
	 */
	@ResponseBody
	@RequestMapping(value = "/notify")
	public String notify(@RequestParam(value = "tradeNo") Long tradeNo, @RequestParam(value = "itemCategory") Integer itemCategory) {
		Result<String> resultOrderTrade = service.notify(tradeNo, itemCategory);
		if (!resultOrderTrade.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return error(resultOrderTrade.getMsg());
		}
		return ties(TARGETID, "补通知成功");
	}
	/**
	 * 补单功能
	 */
	@ResponseBody
	@RequestMapping(value = "/repair")
	public String repair(@RequestParam(value = "tradeNo") Long tradeNo, @RequestParam(value = "itemCategory") Integer itemCategory) {
		Result<OrderTrade> resultOrderTrade = service.repair(tradeNo, itemCategory);
		if (!resultOrderTrade.getCode().equals(ResultEnum.SUCCESS.getCode())) {
			return error(resultOrderTrade.getMsg());
		}
		return ties(TARGETID, "补单成功");
	}

	@RequestMapping(value = "/list")
	public void list(@RequestParam(value = "pageCurrent", defaultValue = "1") int pageCurrent, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize, @ModelAttribute OrderTradeQO qo, ModelMap modelMap) {
		modelMap.put("page", service.listForPage(pageCurrent, pageSize, qo));
		modelMap.put("pageCurrent", pageCurrent);
		modelMap.put("pageSize", pageSize);
		modelMap.put("bean", qo);
	}

	@RequestMapping(value = "/add")
	public void add() {

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
	public String update(@ModelAttribute OrderTradeQO qo) {
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
		modelMap.put("orderStatusEnums", OrderStatusEnum.values());
		modelMap.put("channelEnums", ChannelEnum.values());
		modelMap.put("carrierTypeEnums", CarrierTypeEnum.values());
		modelMap.put("itemTypeEnums", ItemTypeEnum.values());
		modelMap.put("itemCategoryEnums", ItemCategoryEnum.values());
		modelMap.put("flowScopeEnums", FlowScopeEnum.values());
		modelMap.put("flowModeEnums", FlowModeEnum.values());
		modelMap.put("flowPackageTypeEnums", FlowPackageTypeEnum.values());
		modelMap.put("flowStreamTypeEnums", FlowStreamTypeEnum.values());
	}

}
