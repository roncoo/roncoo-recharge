/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.exception.BaseException;

/**
 * 
 * @author wujing
 */
@RestControllerAdvice
public class GatewayExceptionHandler extends BaseRoncoo {

	@ExceptionHandler({ BaseException.class })
	@ResponseStatus(HttpStatus.OK)
	public Result<String> processException(BaseException e) {
		logger.error(e.getMessage(), e);
		return Result.error(e.getMessage());
	}

	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.OK)
	public Result<String> processException(Exception e) {
		logger.error(e.getMessage(), e);
		return Result.error("系统错误");
	}

}
