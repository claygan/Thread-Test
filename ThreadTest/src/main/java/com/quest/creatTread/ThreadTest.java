package com.quest.creatTread;

public class ThreadTest extends Thread {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			new ThreadTest("name:"+i).start();
		}
	}
	ThreadTest(String name){
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName()+" "+i);
		}
	}
	
	
}
