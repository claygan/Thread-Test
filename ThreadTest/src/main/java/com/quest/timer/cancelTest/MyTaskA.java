package com.quest.timer.cancelTest;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {

	@Override
	public void run() {
		System.out.println("A tesk is running:"+new Date());
//		this.cancel();//清除自身定时任务（timerTask）
		System.out.println("A end of task");
	}

}
