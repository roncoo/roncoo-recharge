/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.crontab.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.roncoo.recharge.util.base.BaseController;

/**
 * 定时任务
 * 
 * @author wujing
 */
@Component
public class OrderTask extends BaseController {

	private static final Object KEY = new Object();

	private static boolean TASKFLAG = false;

	// 每分钟执行一次
	@Scheduled(fixedRate = 60000)
	public void orderCancel() {
		synchronized (KEY) {
			if (TASKFLAG) {
				logger.warn("任务已经启动，需要退出。避免在同一时间，有两个任务在同时运行，重复处理数据!");
				return;
			}
			TASKFLAG = true;
		}
		logger.warn("定时任务开始");

		try {

		} catch (Exception e) {
			logger.error("定时任务-取消订单-执行出错", e);
		} finally {
			TASKFLAG = false;
		}
	}

}
