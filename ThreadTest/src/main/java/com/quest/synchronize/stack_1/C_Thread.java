package com.quest.synchronize.stack_1;

public class C_Thread extends Thread {
	private C c;

	public C_Thread(C c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		c.popService();
	}
	
}
