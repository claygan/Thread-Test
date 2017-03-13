package com.quest.synchronize.releaseLockTest;

public class Service {
	public void testMethod(Object lock){
		synchronized(lock){
			try {
				System.out.println("begin wait()");
				lock.wait();
//				Thread.sleep(1000);
				System.out.println("end   wait()");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
