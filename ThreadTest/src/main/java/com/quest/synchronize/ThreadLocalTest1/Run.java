package com.quest.synchronize.ThreadLocalTest1;

public class Run {
	public static ThreadLocal t1 = new ThreadLocal();
	public static void main(String[] args) {
		System.out.println(t1.get());
		if(t1.get() == null){
			System.out.println("从未放过值");
			t1.set("放了一个值");
		}
		System.out.println(t1.get());
		
	}

}
