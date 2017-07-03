package com.quest.synchronize.volatileTest;

public class MyThread extends Thread {
	volatile public static int count;//如果使用synchronized修饰，这里的volatile就没有必要使用了
	volatile public static int[] array;//如果volatile修饰数组，只针对引用有作用，但是对元素不能起到保护作用
	synchronized private static void addCount(){
		for(int i=0;i<100;i++){
			count++;
		}
		System.out.println("count="+count);
	}
	@Override
	public void run() {
		addCount();
	}
	
}
