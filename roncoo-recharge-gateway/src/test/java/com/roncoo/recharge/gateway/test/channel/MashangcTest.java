/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.gateway.test.channel;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.roncoo.recharge.util.IdWorker;
import com.roncoo.recharge.util.Native2AsciiUtil;
import com.xiaoleilu.hutool.crypto.DigestUtil;
import com.xiaoleilu.hutool.http.HttpUtil;

public class MashangcTest {
	private static final String TELURL = "http://www.mashangc.com/index.php/mobile/telquery_msc";
	private static final String ORDERURL = "http://www.mashangc.com/index.php/mobile/ostate_msc";
	private static final String YUEURL = "http://www.mashangc.com/index.php/mobile/yue_msc";

	private static final String KEY = "RDqdd5Fsfb32yxspA635BwNf6M9te1d6";
	private static final String USER_ID = "15820530994";

	public static void main(String[] args) throws UnsupportedEncodingException {
		// String rechargeResult = rechargeTel("18302045627", "10", IdWorker.getId());
		// System.out.println(Native2AsciiUtil.ascii2native(rechargeResult));

		String queryResult = queryTel(IdWorker.getId());
		System.out.println(Native2AsciiUtil.ascii2native(queryResult));

		 String yueQuery = yueQuery();
		 System.out.println(Native2AsciiUtil.ascii2native(yueQuery));

		// System.out.println(DigestUtil.md5Hex(DigestUtil.md5Hex("123456")));
	}

	/**
	 * 充值接口
	 */
	public static String rechargeTel(String mobile, String cardnum, long orderNo) {
		Map<String, Object> map = new HashMap<>();
		map.put("user_id", USER_ID);
		map.put("phone", mobile);
		map.put("cardnum", cardnum);
		map.put("orderid", orderNo);
		map.put("callbackurl", "http://baidu.com");
		map.put("sign", getSign(map));
		return HttpUtil.post(TELURL, map);
	}

	/**
	 * 查询接口
	 */
	public static String queryTel(long orderNo) {
		Map<String, Object> map = new HashMap<>();
		map.put("user_id", USER_ID);
		map.put("orderid", orderNo);
		map.put("sign", getSign(map));
		return HttpUtil.post(ORDERURL, map);
	}

	/**
	 * 余额查询
	 */
	public static String yueQuery() {
		Map<String, Object> map = new HashMap<>();
		map.put("user_id", USER_ID);
		map.put("sign", getSign(map));
		return HttpUtil.post(YUEURL, map);
	}

	private static String getSign(Map<String, Object> map) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Object> m : map.entrySet()) {
			sb.append(m.getValue());
		}
		return DigestUtil.md5Hex(DigestUtil.md5Hex(sb.toString()) + KEY);
	}

}
