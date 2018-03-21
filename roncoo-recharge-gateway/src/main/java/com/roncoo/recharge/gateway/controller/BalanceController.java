/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.recharge.api.request.BalanceRequest;
import com.roncoo.recharge.api.response.BalanceResponse;
import com.roncoo.recharge.gateway.service.BalanceService;
import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.base.Result;
import com.xiaoleilu.hutool.http.HttpUtil;

/**
 * 查询接口
 */
@RestController
@RequestMapping(value = "/balance")
public class BalanceController extends BaseController {

	@Autowired
	private BalanceService service;

	/**
	 * 余额查询接口
	 */
	@RequestMapping(value = "/query")
	public Result<BalanceResponse> balanceQuery(@Validated BalanceRequest balanceRequest, BindingResult bindingResult, HttpServletRequest request) {
		logger.warn("余额查询接口：IP={}, 参数={}", HttpUtil.getClientIP(request), balanceRequest);

		// 参数校验
		if (bindingResult.hasErrors()) {
			StringBuilder sb = new StringBuilder();
			for (FieldError fieldError : bindingResult.getFieldErrors()) {
				sb.append(fieldError.getDefaultMessage()).append(",");
			}
			logger.warn("余额查询接口：参数错误={}", sb);
			return Result.error(sb.substring(0, sb.length() - 1));
		}

		// 查询
		return service.balanceQuery(balanceRequest);
	}

}
