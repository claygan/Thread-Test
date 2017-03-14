package com.quest.timer.scheduleTest;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
//		System.out.println("任务执行了，时间为："+new Date());
		try {
			System.out.println("A begin timer="+ new Date());
			Thread.sleep(2000);
			System.out.println("A end timer="+ new Date());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
