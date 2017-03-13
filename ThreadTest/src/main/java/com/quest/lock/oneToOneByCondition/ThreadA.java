package com.quest.lock.oneToOneByCondition;

public class ThreadA extends Thread {
	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			myService.set();
		}
	}
	
}
