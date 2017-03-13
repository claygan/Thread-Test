package com.quest.lock.reentrantReadWriteLockTest;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read(){
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得读锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("read over");
			} finally {
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void write(){
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获得写锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("write over");
			} finally {
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
