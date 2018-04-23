/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.boss.common;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.roncoo.recharge.boss.bean.vo.SysMenuVO;
import com.roncoo.recharge.common.dao.SysUserInfoDao;
import com.roncoo.recharge.common.entity.SysUserInfo;
import com.roncoo.recharge.util.Constants;
import com.roncoo.recharge.util.JSONUtil;
import com.roncoo.recharge.util.base.BaseRoncoo;
import com.roncoo.recharge.util.bjui.Bjui;
import com.roncoo.spring.boot.autoconfigure.shiro.ShiroRealm;
import com.xiaoleilu.hutool.crypto.DigestUtil;
import com.xiaoleilu.hutool.util.CollectionUtil;

/**
 * 拦截器
 */
@Configuration
public class WebMvcConfiguration {

	/**
	 * ShiroRealm
	 */
	@Bean(name = "shiroRealm")
	public ShiroRealm shiroRealm() {
		ShiroCustomRealm realm = new ShiroCustomRealm();
		return realm;
	}

	@Bean
	ShiroInterceptor shiroInterceptor() {
		return new ShiroInterceptor();
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
		// logger.info(ReflectionToStringBuilder.toString(token,
		// ToStringStyle.MULTI_LINE_STYLE));

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

/**
 * 权限拦截器
 */
class ShiroInterceptor extends BaseRoncoo implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getServletPath();
		if (!checkUri(uri)) {
			logger.error("没此权限，当前访问路径为：{}", uri);
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			Bjui bj = new Bjui();
			bj.setStatusCode(300);
			bj.setMessage("没此权限，请联系管理员！");
			out.print(JSONUtil.toJSONString(bj));
			out.flush();
			out.close();
			return false;
		}
		return true;
	}

	private static Boolean checkUri(String uri) {
		List<SysMenuVO> menuVOList = JSONUtil.parseArray(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.MENU).toString(), SysMenuVO.class);
		Set<String> menuSet = new HashSet<>();
		listMenu(menuSet, menuVOList);
		if (StringUtils.hasText(uri) && uri.endsWith("/")) {
			uri = uri.substring(0, uri.length() - 1);
		}
		for (String s : menuSet) {
			if (s.contains(uri)) {
				return true;
			}
		}
		return false;
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

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

}
