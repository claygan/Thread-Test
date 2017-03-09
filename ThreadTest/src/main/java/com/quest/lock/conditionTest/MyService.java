package com.quest.lock.conditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	/**
	 * 进入等待
	 */
	public void await(){
		try {
			lock.lock();
			System.out.println("await 时间为"+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	/**
	 * 通知
	 */
	public void signal(){
		try {
			lock.lock();
			System.out.println("signal 时间为" + System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
		
	}
}
