/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.bean.qo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台用户信息
 * </p>
 *
 * @author wujing
 * @since 2017-12-27
 */
@Data
@Accessors(chain = true)
public class SysUserInfoQO implements Serializable {

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
	 * 修改时间
	 */
	private Date gmtModified;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 1 正常 2 冻结 9 注销
	 */
	private Integer statusId;
	/**
	 * 1 内部 2 下游
	 */
	private Integer userType;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 用户名
	 */
	private String nickName;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 * 地址
	 */
	private String addr;
	/**
	 * 密码盐
	 */
	private String salt;
	/**
	 * 登录密码
	 */
	private String pwd;
}
