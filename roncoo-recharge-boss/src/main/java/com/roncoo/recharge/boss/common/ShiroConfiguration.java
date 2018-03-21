/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration.FreeMarkerWebConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import com.roncoo.recharge.boss.bean.vo.SysMenuVO;
import com.roncoo.recharge.common.dao.SysUserInfoDao;
import com.roncoo.recharge.common.entity.SysUserInfo;
import com.roncoo.recharge.util.Constants;
import com.roncoo.recharge.util.JSONUtil;
import com.roncoo.shiro.freemarker.ShiroTags;
import com.roncoo.spring.boot.autoconfigure.shiro.ShiroRealm;
import com.xiaoleilu.hutool.crypto.DigestUtil;
import com.xiaoleilu.hutool.util.CollectionUtil;

/**
 * shiro配置类
 */
@Configuration
public class ShiroConfiguration extends FreeMarkerWebConfiguration {

	@Autowired
	private freemarker.template.Configuration configuration;

	@PostConstruct
	public void setSharedVariable() {
		try {
			configuration.setSharedVariable("shiro", new ShiroTags());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ShiroRealm
	 */
	@Bean(name = "shiroRealm")
	public ShiroRealm shiroRealm() {
		ShiroCustomRealm realm = new ShiroCustomRealm();
		return realm;
	}

}

class ShiroCustomRealm extends ShiroRealm {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SysUserInfoDao sysUserInfoDao;

	/**
	 * 授权认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		List<SysMenuVO> menuVOList = JSONUtil.parseArray(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.MENU).toString(), SysMenuVO.class);
		Set<String> menuSet = new HashSet<>();
		// 处理菜单权限
		listMenu(menuSet, menuVOList);
		simpleAuthorizationInfo.setStringPermissions(menuSet);
		return simpleAuthorizationInfo;
	}

	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) arg0;
		//logger.info(ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));

		SysUserInfo sysUserInfo = sysUserInfoDao.getByLoginName(token.getUsername());
		if (null == sysUserInfo) {
			throw new UnknownAccountException("账号或者密码不正确");
		}

		if (!sysUserInfo.getPwd().equals(DigestUtil.md5Hex(sysUserInfo.getSalt() + new String(token.getPassword())))) {
			throw new UnknownAccountException("账号或者密码不正确");
		}

		SecurityUtils.getSubject().getSession().setAttribute(Constants.Session.USER_TYPE, sysUserInfo.getUserType());
		SecurityUtils.getSubject().getSession().setAttribute(Constants.Session.USER_ID, sysUserInfo.getId());
		SecurityUtils.getSubject().getSession().setAttribute(Constants.Session.USER, JSONUtil.toJSONString(sysUserInfo));
		return new SimpleAuthenticationInfo(token.getUsername(), token.getPassword(), getName());
	}

	/**
	 * @param list
	 * @return
	 */
	private static void listMenu(Set<String> menuSet, List<SysMenuVO> menuVOList) {
		if (CollectionUtil.isNotEmpty(menuVOList)) {
			for (SysMenuVO sm : menuVOList) {
				if (StringUtils.hasText(sm.getMenuUrl())) {
					menuSet.add(sm.getMenuUrl());
				}
				listMenu(menuSet, sm.getList());
			}
		}
	}

}
