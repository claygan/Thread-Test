package com.quest.lock.getQueueLengthTest;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			public void run() {
				service.serviceMethod1();
			}
		};
		Thread[] threadArr = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArr[i] = new Thread(runnable);
			threadArr[i].start();
		}
		Thread.sleep(2000);
		System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁！");
	}

}
