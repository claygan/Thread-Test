package com.quest.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
	public static AtomicLong aiRef = new AtomicLong();
	synchronized public void addNum(){
		System.out.println(Thread.currentThread().getName()+"加了一百之后的值："+aiRef.addAndGet(100));
		aiRef.incrementAndGet();
	}
}
