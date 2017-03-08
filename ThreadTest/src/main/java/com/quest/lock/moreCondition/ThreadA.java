package com.quest.lock.moreCondition;

public class ThreadA extends Thread {
	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.awaitA();
	}
	
}
