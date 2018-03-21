/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

public final class BigDecimalUtils {
	private BigDecimalUtils() {

	}
	
	/**
	 * 元转化成厘
	 */
	public static Integer integerMultiply(Integer v1) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(1000);
		BigDecimal value = b1.multiply(b2).setScale(0, BigDecimal.ROUND_HALF_UP);
		return value.intValue();
	}

	/**
	 * 元转化成厘
	 */
	public static Integer integerMultiply(String v1) {
		if (StringUtils.isEmpty(v1)) {
			return null;
		}
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(1000);
		BigDecimal value = b1.multiply(b2).setScale(0, BigDecimal.ROUND_HALF_UP);
		return value.intValue();
	}

	/**
	 * 厘转换成元
	 */
	public static String stringDiveid(Integer v1) {
		if (v1 == null) {
			return null;
		}
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(1000);
		return b1.divide(b2).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
	}
	
	/**
	 * 厘转换成元
	 */
	public static Double doubleDiveid(Integer v1) {
		if (v1 == null) {
			return null;
		}
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(1000);
		return b1.divide(b2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
