package com.quest.lock.lockInterruptiplyTest;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();
	private Condition condition =lock.newCondition();
	public void waitMethod(){
		try {
			lock.lockInterruptibly();
			
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.SECOND, 10);
			condition.awaitUntil(calendar.getTime());
			
			System.out.println("lock begin:" + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println("lock end:" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			System.out.println("线程"+Thread.currentThread().getName()+"进入catch~");
			e.printStackTrace();
		} finally {
			//判断当前线程获取该锁定，才会进来解锁
			if(lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
}
