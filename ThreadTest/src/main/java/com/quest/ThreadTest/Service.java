package com.quest.ThreadTest;

public class Service {
	synchronized public void printA(){
		try {
			System.out.println("name="+Thread.currentThread().getName()+" : 进入printA");
			Thread.sleep(3000);
			System.out.println("name="+Thread.currentThread().getName()+" : 离开printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized  public void printB(){
		try {
			System.out.println("name="+Thread.currentThread().getName()+" : 进入printB");
			Thread.sleep(3000);
			System.out.println("name="+Thread.currentThread().getName()+" : 离开printB");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
