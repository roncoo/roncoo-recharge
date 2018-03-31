/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.roncoo.recharge.util.base.BaseRoncoo;
import com.xiaoleilu.hutool.http.HttpUtil;

/**
 * 拦截器
 */
@Configuration
public class WebMvcConfigurer {

	@Bean
	ShiroInterceptor shiroInterceptor() {
		return new ShiroInterceptor();
	}

}

/**
 * 权限拦截器
 */
class ShiroInterceptor extends BaseRoncoo implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// 校验请求的ip
		System.out.println(HttpUtil.getClientIP(request));

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

}
