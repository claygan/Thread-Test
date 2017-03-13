package com.quest.synchronize.waitHasParamMethod;

public class MyRunnable {
	static private Object lock = new Object();
	static private Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			synchronized(lock){
				 try {
					System.out.println("wait begin time="+System.currentTimeMillis());
					 lock.wait(0);
					 System.out.println("没有线程唤醒，就自己唤醒自己");
					 System.out.println("wait end time  ="+System.currentTimeMillis());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	public static void main(String[] args) {
		Thread t= new Thread(runnable);
		t.start();
	}
}
