/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.roncoo.recharge.util.base.Result;
import com.roncoo.recharge.util.enums.ResultEnum;

public class HttpRestUtil {

	private static SimpleClientHttpRequestFactory requestFactory = null;
	static {
		requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setConnectTimeout(10000); // 10秒
		requestFactory.setReadTimeout(60000); // 60秒
	}
	private static RestTemplate restTemplate = new RestTemplate(requestFactory);

	public static <T> T postForObject(String url, Object obj, Class<T> clazz) {
		Map<String, Object> map = transBean2Map(obj);
		return restTemplate.postForObject(url, map, clazz);
	}

	public static <T> T getForObject(String url, Object obj, Class<T> clazz) {
		Map<String, Object> map = transBean2Map(obj);
		return restTemplate.getForObject(url, clazz, map);
	}

	public static <T extends Serializable> Result<T> postForResultObject(String url, Object obj, Class<T> clazz) {
		Map<String, Object> map = transBean2Map(obj);
		JsonNode jsonNode = restTemplate.postForObject(url, map, JsonNode.class);
		if (jsonNode.get("code").asInt() == ResultEnum.SUCCESS.getCode().intValue()) {
			return Result.success(JSONUtil.parseObject(jsonNode.get("data").toString(), clazz));
		}
		return Result.error(jsonNode.get("msg").asText());
	}

	public static <T extends Serializable> Result<T> getForResultObject(String url, Object obj, Class<T> clazz) {
		Map<String, Object> map = transBean2Map(obj);
		JsonNode jsonNode = restTemplate.getForObject(url, JsonNode.class, map);
		if (jsonNode.get("code").asInt() == ResultEnum.SUCCESS.getCode().intValue()) {
			return Result.success(JSONUtil.parseObject(jsonNode.get("data").toString(), clazz));
		}
		return Result.error(jsonNode.get("msg").asText());
	}

	@SuppressWarnings("unchecked")
	private static Map<String, Object> transBean2Map(Object obj) {
		if (obj == null) {
			return null;
		}
		if (obj instanceof AbstractMap) {
			return (AbstractMap<String, Object>) obj;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();
				if (!key.equals("class")) {
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);
					map.put(key, value);
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return map;
	}

}
