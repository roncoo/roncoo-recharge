/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util.base;

import java.io.Serializable;

import com.roncoo.recharge.util.enums.ResultEnum;

/**
 * 接口返回对象实体
 * 
 * @author wujing
 * @param <T>
 */
public class Result<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 错误码
	 */
	private Integer code = ResultEnum.ERROR.getCode();

	/**
	 * 错误信息
	 */
	private String msg = null;

	/**
	 * 返回结果实体
	 */
	private T data = null;

	private Result(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static <T extends Serializable> Result<T> error(String msg) {
		return new Result<T>(ResultEnum.ERROR.getCode(), msg, null);
	}

	public static <T extends Serializable> Result<T> error(int code, String msg) {
		return new Result<T>(code, msg, null);
	}

	public static <T extends Serializable> Result<T> success(T data) {
		return new Result<T>(ResultEnum.SUCCESS.getCode(), "", data);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
