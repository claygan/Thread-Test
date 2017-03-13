package com.quest.lock.lockInterruptiplyTest;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};
		Thread a = new Thread(runnable);
		a.setName("A");
		a.start();
		Thread.sleep(500);
		Thread b = new Thread(runnable);
		b.setName("B");
		b.start();
		b.interrupt();//打标记
		System.out.println("main end!");
		
	}
}
