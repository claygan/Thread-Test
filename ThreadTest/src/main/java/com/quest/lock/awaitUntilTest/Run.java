package com.quest.lock.awaitUntilTest;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//测试awaitUntil方法
		final Service service = new Service();
		//测试wait方法
		final Service1 service1 = new Service1();
		new Thread(new Runnable() {
			@Override
			public void run() {
//				service.waitMethod();
				service1.waitMethod();
			}
		}).start();
		Thread.sleep(2000);//可以提前被其他线程唤醒
		new Thread(new Runnable() {
			
			@Override
			public void run() {
//				service.signalMethod();
				service1.notifyMethod();
			}
		}).start();
		

	}

}
