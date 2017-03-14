package com.quest.timer.scheduleAtFixedRateTest;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
			System.out.println("begin timer="+new Date());
			System.out.println("end   timer="+new Date());
	}

}
