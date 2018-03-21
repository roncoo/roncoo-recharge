/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 配置文件读取工具类
 *
 * @author wujing
 */
public final class ConfigUtil {

	private ConfigUtil() {

	}

	/**
	 * 通过静态代码块读取上传文件的验证格式配置文件,静态代码块只执行一次(单例)
	 */
	private static final Properties properties = new Properties();

	// 通过类装载器装载进来
	static {
		try {
			// 从类路径下读取属性文件
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据key读取value
	 *
	 * @param keyName
	 *            key
	 * @return
	 */
	public static String getProperty(String keyName) {
		return getProperty(keyName, "");
	}

	/**
	 * 根据key读取value，key为空，返回默认值
	 *
	 * @param keyName
	 *            key
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public static String getProperty(String keyName, String defaultValue) {
		return properties.getProperty(keyName, defaultValue).trim();
	}

	public static final String GATEWAY_URL = getProperty("gateway.url");
	public static final String PLATFORM_APPID = getProperty("platform.appId");
	public static final String CHECK_ORDER_EXCHANGE_URL = getProperty("check.order.exchange.url");
	public static final String CHECK_ORDER_RECHARGE_URL = getProperty("check.order.recharge.url");
	public static final String REPAIR_ORDER_EXCHANGE_URL = getProperty("repair.order.exchange.url");
	public static final String REPAIR_ORDER_RECHARGE_URL = getProperty("repair.order.recharge.url");
	public static final String REPAIR_NOTIFY_EXCHANGE_URL = getProperty("repair.notify.exchange.url");
	public static final String REPAIR_NOTIFY_RECHARGE_URL = getProperty("repair.notify.recharge.url");
	public static final String BALANCE_QUERY_URL = getProperty("balance.query.url");

}
