package com.quest.lock.getWaitQueueLengthTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void awaitMethod(){
		try {
			lock.lock();
			condition.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void signalMethod(){
		try {
			lock.lock();
			System.out.println("有"+lock.getWaitQueueLength(condition)+"个线程正在等待condition");
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
