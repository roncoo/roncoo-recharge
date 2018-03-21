/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

import java.util.Date;
import java.util.Random;

import com.xiaoleilu.hutool.date.DateUtil;

public final class NOUtil {

	private NOUtil() {
	}

	public static Long getTradeNo() {
		return Long.valueOf(DateUtil.format(new Date(), "yyyyMMddHHmmss") + getRandom(5));
	}

	private static String getRandom(int bound) {
		Random ra = new Random();
		String result = "";
		for (int i = 1; i <= bound; i++) {
			result += ra.nextInt(10);
		}
		return result;
	}

}
