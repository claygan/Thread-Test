package com.quest.lock.fair_noFair_test;

public class Run {

	public static void main(String[] args) {
		//测试公平锁
		final Service fairService = new Service(true);
		//测试不公平锁
		final Service noFairService = new Service(false);
		
		Runnable runnable = new Runnable() {
			@Override 
			public void run() {
				System.out.println("★线程 "+Thread.currentThread().getName()+"运行了");
//				fairService.method();
				noFairService.method();
			}                                                                                                                                                                                                                                                                                                                               
		};
		Thread[] threadArr = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArr[i] = new Thread(runnable);
			threadArr[i].start();
		}
		
	}

}
