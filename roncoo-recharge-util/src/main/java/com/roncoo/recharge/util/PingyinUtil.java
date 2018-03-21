/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public final class PingyinUtil {

	private PingyinUtil() {
	}

	public static String toPingyin(String zhongwen) {
		HanyuPinyinOutputFormat hanYuPinOutputFormat = new HanyuPinyinOutputFormat();
		hanYuPinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		try {
			return PinyinHelper.toHanYuPinyinString(zhongwen, hanYuPinOutputFormat, "", true);
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			e.printStackTrace();
			return "";
		}
	}

}
