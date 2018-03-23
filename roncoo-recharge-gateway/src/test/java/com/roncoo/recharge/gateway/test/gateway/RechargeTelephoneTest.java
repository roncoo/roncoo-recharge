/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.test.gateway;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.xiaoleilu.hutool.crypto.DigestUtil;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.http.HttpUtil;

public class RechargeTelephoneTest {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 50; i++) {
			recharge();
		}
	}

	public static void recharge() {
		TreeMap<String, Object> map = new TreeMap<>();
		map.put("appId", "RCbc0f20736d264c96b525d62e97428aba");
		map.put("mobile", "18302045627");
		map.put("productType", "2");
		map.put("productNo", "21100000100000");
		map.put("amount", "100元");
		map.put("orderNo", DateUtil.format(new Date(), "yyyyMMddHHmmssSSS"));
		map.put("orderTime", "2017-10-10");
		map.put("notifyUrl", "http://127.0.0.1:8080/recharge/notify/longguochongzhi");
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Object> m : map.entrySet()) {
			sb.append(m.getKey()).append("=").append(m.getValue()).append("&");
		}
		sb.append("6bdef1a23d5c466cadf51dccd651f7ba");
		map.put("sign", DigestUtil.md5Hex(sb.toString()));
		String url = "http://localhost:8080/recharge?";
		System.out.println("请求报文：" + url + sb);
		System.out.println("返回报文：" + HttpUtil.post(url, map));
	}

}
