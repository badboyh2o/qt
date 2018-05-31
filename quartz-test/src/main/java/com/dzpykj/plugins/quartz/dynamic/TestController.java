package com.dzpykj.plugins.quartz.dynamic;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
    	try {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
    		Scheduler scheduler = schedulerFactory.getScheduler();
    		
    		JobDetail jobDetail = newJob(UserVisitCountQuartzJob.class)
    				//.withIdentity("UserVisitCountJob", "UserVisitCountJobGroup")
    				.build();
    		CronTrigger simpleTrigger = newTrigger()
    				//.withIdentity("simpleTrigger2", "triggerGroup2")
    				.withSchedule(cronSchedule("0/1 * * * * ?")) //每隔一秒执行一次
    				.startNow()
    				.build();
    		Date ft = scheduler.scheduleJob(jobDetail, simpleTrigger);
    		System.err.println("++++++++++++++");
    		scheduler.start();
    	} catch (SchedulerException e) {
    		e.printStackTrace();
    	}
		return null;
	}
}
