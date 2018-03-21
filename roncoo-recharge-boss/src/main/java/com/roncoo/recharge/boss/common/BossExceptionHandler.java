/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.common;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.roncoo.recharge.util.base.BaseController;
import com.roncoo.recharge.util.exception.BaseException;

/**
 */
@RestControllerAdvice
public class BossExceptionHandler extends BaseController {

	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.OK)
	public String processException(Exception e) {
		logger.error(e.getMessage(), e);
		return error("系统异常");
	}

	@ExceptionHandler({ BaseException.class })
	@ResponseStatus(HttpStatus.OK)
	public String processException(BaseException e) {
		logger.error(e.getMessage(), e);
		return error(e.getMessage());
	}

	@ExceptionHandler({ UnauthorizedException.class })
	@ResponseStatus(HttpStatus.OK)
	public String processException(UnauthorizedException e) {
		logger.error(e.getMessage(), e);
		return error("没此权限，请联系管理员");
	}

}
