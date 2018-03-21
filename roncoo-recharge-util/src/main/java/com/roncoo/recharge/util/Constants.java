/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.util;

/**
 * 常量工具类
 * 
 * @author wujing
 */
public final class Constants {

	private Constants() {
	}
	
	/**
	 * 常量
	 * 
	 * @author wujing
	 */
	public interface BeanSuffix {
		public final static String CARD = "_card";
		public final static String TELEPHONE = "_telephone";
		public final static String FLOW = "_flow";
	}

	/**
	 * 常量
	 * 
	 * @author wujing
	 */
	public interface Session {
		public final static String USER_TYPE = "roncoo_user_type";
		public final static String USER_ID = "roncoo_user_info_id";
		public final static String USER = "roncoo_user";
		public final static String MENU = "roncoo_menu";
	}

}
