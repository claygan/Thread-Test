package com.quest.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewCachedThreadPoolTest {

	public static void main(String[] args) {
		ScheduledExecutorService es = Executors.newScheduledThreadPool(3);
			//延迟3秒执行
			es.schedule(new Runnable() {
				@Override
				public void run() {
					System.out.println("delay 3 seconds");  
				}
			},3,TimeUnit.SECONDS);
			//延迟1秒后每3秒执行一次。
			es.scheduleAtFixedRate(new Runnable() {
				@Override
				public void run() {
					System.out.println("delay 1 seconds, and excute every 3 seconds");  
				}
			},1,3,TimeUnit.SECONDS);
		
	}

}
