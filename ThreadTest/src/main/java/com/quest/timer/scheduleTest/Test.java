package com.quest.timer.scheduleTest;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 10);
		Date runDate = calendar.getTime();
		 
		MyTask myTask = new MyTask();
		Timer timer = new Timer();//若改成守护线程+true，就会随着主线程的销毁而销毁，但是不会再执行TimeTask中的任务了
//		timer.schedule(myTask, runDate);
		timer.schedule(myTask, 10000, 2000);
		
	}

}
