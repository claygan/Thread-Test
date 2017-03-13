package com.quest.synchronize.atomicIntegerNoSafe;

public class Run {

	public static void main(String[] args) {
		try {
			MyService myService = new MyService();
			MyThread[] myThread = new MyThread[5];
			for (int i = 0; i < myThread.length; i++) {
				myThread[i] = new MyThread(myService);
			}
			for (int i = 0; i < myThread.length; i++) {
				myThread[i].start();
			}
			Thread.sleep(1000);
			System.out.println(myService.aiRef.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
