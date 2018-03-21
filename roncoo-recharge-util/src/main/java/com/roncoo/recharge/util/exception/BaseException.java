/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 业务异常基类
 */
@Setter
@Getter
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	public BaseException() {
		super();
	}

	public BaseException(String message) {
		super(message);
		this.message = message;
	}

}
