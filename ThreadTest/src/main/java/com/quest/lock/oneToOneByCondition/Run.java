package com.quest.lock.oneToOneByCondition;

public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		//一对一（生产者/消费者模式）
//		ThreadA a = new ThreadA(myService);
//		a.start();
//		ThreadB b = new ThreadB(myService);
//		b.start();
		//多对多
		ThreadA[] a = new ThreadA[10];
		ThreadB[] b = new ThreadB[10];
		for (int i = 0; i < 10; i++) {
			a[i] = new ThreadA(myService);
			b[i] = new ThreadB(myService);
			a[i].start();
			b[i].start();
		}
		
		
		
	}

}
