package com.quest.timer.cancelTest;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Now time is :"+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 5);
		Date runTime = calendar.getTime();
		System.out.println("Plan time is:"+runTime);
		
		MyTaskA a = new MyTaskA();
		MyTaskB b = new MyTaskB();
		Timer timer = new Timer();
		timer.schedule(a, runTime, 2000);
		timer.schedule(b, runTime, 2000);
		Thread.sleep(10000);
		timer.cancel();//清除任务队列中的所有定时任务(Timer)
	}

}
