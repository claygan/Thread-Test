package com.quest.synchronize.inheritableThreadLocalTest;

public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在Main线程中取值="+Tools.t1.get());
				Thread.sleep(200);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
