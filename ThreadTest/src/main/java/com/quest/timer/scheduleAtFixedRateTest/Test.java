package com.quest.timer.scheduleAtFixedRateTest;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		System.out.println("Now time is :"+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND)-20);
		System.out.println("计划时间："+calendar.getTime());
		MyTask myTask = new MyTask();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(myTask, calendar.getTime(), 2000);//启动这段时间的任务会被补充起来执行，这就是scheduleAtFixedRate方法的“追赶”执行性
	}

}
