/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

import java.util.Map;
import java.util.TreeMap;

import com.xiaoleilu.hutool.crypto.DigestUtil;

public final class SignUtil {

	private SignUtil() {
	}

	public static boolean checkSign(TreeMap<String, Object> map, String AppSeceret) {
		String sign = map.get("sign").toString();
		map.remove("sign");
		map.remove("serialVersionUID");
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<String, Object> m : map.entrySet()) {
			if (m.getValue() != null) {
				sb.append(m.getKey()).append("=").append(m.getValue().toString()).append("&");
			}
		}
		sb.append(AppSeceret);
		if (sign.equals(DigestUtil.md5Hex(sb.toString()))) {
			return true;
		}
		return false;
	}

	public static String getSign(TreeMap<String, Object> map, String AppSeceret) {
		map.remove("sign");
		map.remove("serialVersionUID");
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<String, Object> m : map.entrySet()) {
			if (m.getValue() != null) {
				sb.append(m.getKey()).append("=").append(m.getValue().toString()).append("&");
			}
		}
		sb.append(AppSeceret);
		return DigestUtil.md5Hex(sb.toString());
	}

}
