package com.quest.creatTread;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		RunnableTest runnableTest = new RunnableTest();
		for (int i = 0; i < 5; i++) {
			new Thread(runnableTest).start();
		}
	}

}
