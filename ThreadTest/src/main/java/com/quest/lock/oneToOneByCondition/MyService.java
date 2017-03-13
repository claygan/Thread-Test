package com.quest.lock.oneToOneByCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	volatile private boolean hasValue = false;
	
	public void set(){
		try {
			lock.lock();
			while(hasValue){
				System.out.println("有可能★连续");
				condition.await();
			}
			System.out.println("★★★");
			hasValue = true;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public void get(){
		try {
			lock.lock();
			while(!hasValue){
				System.out.println("有可能☆连续");
				condition.await();
			}
			System.out.println("☆☆☆");
			hasValue = false;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
