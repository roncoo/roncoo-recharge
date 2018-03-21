/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

/**
 * Native2AsciiUtil
 */
public final class Native2AsciiUtil {
	
	private Native2AsciiUtil() {

	}

	private static final String PREFIX = "\\u";

	/**
	 * ascii2native \u0101ABC\u0102 --> ABC
	 */
	public static String ascii2native(String text) {
		StringBuilder sb = new StringBuilder();
		int start = 0;
		int idx = text.indexOf(PREFIX);
		while (idx != -1) {
			sb.append(text.substring(start, idx));
			String ascii = text.substring(idx + 2, idx + 6);
			char ch = (char) Integer.parseInt(ascii, 16);
			sb.append(ch);
			start = idx + 6;
			idx = text.indexOf(PREFIX, start);
		}
		sb.append(text.substring(start));
		return sb.toString();
	}

	/**
	 * native2ascii ABC --> \u0101ABC\u0102
	 */
	public static String native2ascii(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			String ascii = char2ascii(ch);
			sb.append(ascii);
		}
		return sb.toString();
	}

	private static String char2ascii(char ch) {
		if (ch < 256) {
			return Character.toString(ch);
		}
		String hex = Integer.toHexString(ch);
		if (hex.length() < 4) {
			hex = "0" + hex;
		}
		return PREFIX + hex;
	}
}
