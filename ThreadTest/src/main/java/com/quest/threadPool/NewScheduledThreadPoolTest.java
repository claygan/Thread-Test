package com.quest.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewScheduledThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			es.execute(new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println(index);  
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}  
				}
			});
		}
		
		
		
	}

}
