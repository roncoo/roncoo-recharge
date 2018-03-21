/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户登陆日志
 * </p>
 *
 * @author wujing
 * @since 2017-12-27
 */
@Data
@Accessors(chain = true)
public class SysLogLoginVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 用户ID
	 */
	private Long userInfoId;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 登录IP
	 */
	private String loginIp;
	/**
	 * 上次登录IP
	 */
	private String lastLoginIp;
	/**
	 * 上次登录时间
	 */
	private Date lastLoginTime;

}
