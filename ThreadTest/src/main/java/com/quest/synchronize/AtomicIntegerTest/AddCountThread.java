package com.quest.synchronize.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
	private AtomicInteger count = new AtomicInteger(0);
//	private volatile int count = 0;
	@Override
	public void run() {
		synchronized(this){
			for (int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
//				System.out.println(count++);
			}
		}
	}
	
}
