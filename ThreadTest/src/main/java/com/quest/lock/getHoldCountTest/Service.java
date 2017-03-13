package com.quest.lock.getHoldCountTest;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1(){
		try {
			lock.lock();
			System.out.println("ServiceMethod1 getholdCount=" + lock.getHoldCount());
			serviceMethod2();
		} finally {
			lock.unlock();
		}
	}
	public void serviceMethod2(){
		try {
			lock.lock();
			System.out.println("ServiceMethod2 getholdCount=" + lock.getHoldCount());
		} finally {
			lock.unlock();
		}
	}
}
