package com.quest.timer.cancelTest;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {

	@Override
	public void run() {
		System.out.println("B tesk is running:"+new Date());
	}

}
