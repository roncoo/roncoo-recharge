/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.test.gateway;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.roncoo.recharge.util.IdWorker;
import com.xiaoleilu.hutool.crypto.DigestUtil;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.http.HttpUtil;

public class ExchangeCardTest {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			exchange();
		}
	}

	public static void exchange() {
		TreeMap<String, Object> map = new TreeMap<>();
		map.put("appId", "RCbc0f20736d264c96b525d62e97428aba");
		map.put("category", "1");
		map.put("carrierType", "1");
		map.put("amount", "100元");
		map.put("cardNo", String.valueOf(System.currentTimeMillis()));
		map.put("cardPwd", IdWorker.getId());
		map.put("orderNo", DateUtil.format(new Date(), "yyyyMMddHHmmssSSS"));
		map.put("orderTime", "2017-10-10");
		map.put("notifyUrl", "http://127.0.0.1:8080/exchange/notify/roncooduihuan");
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Object> m : map.entrySet()) {
			sb.append(m.getKey()).append("=").append(m.getValue()).append("&");
		}
		sb.append("6bdef1a23d5c466cadf51dccd651f7ba");
		map.put("sign", DigestUtil.md5Hex(sb.toString()));
		String url = "http://localhost:8080/exchange?";
		System.out.println("请求报文：" + url + sb);
		System.out.println("返回报文：" + HttpUtil.post(url, map));
	}

}
