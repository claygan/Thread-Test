package com.quest.lock.oneToOneByCondition;

public class ThreadB extends Thread {
	private MyService myService;

	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			myService.get();
		}
	}
	
}
