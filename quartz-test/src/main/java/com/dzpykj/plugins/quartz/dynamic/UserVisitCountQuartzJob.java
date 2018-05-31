package com.dzpykj.plugins.quartz.dynamic;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 统计昨日登录人数(已注册,而且昨日访问过APP的用户人数)类
 * @author ChaiXY
 */
public class UserVisitCountQuartzJob implements Job {
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			System.err.println("---------------");
		} catch (Exception e) {
		}
	}
}