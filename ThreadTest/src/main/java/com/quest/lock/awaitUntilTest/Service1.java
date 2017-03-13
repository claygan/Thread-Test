package com.quest.lock.awaitUntilTest;

/** 
 * @ClassName: Service1
 * @Description: 使用synchronized锁相应的wait方法是否可以中途被唤醒
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年3月9日 下午4:13:00
 */  
public class Service1 {
	public void waitMethod(){
		try {
			synchronized(this){
				System.out.println("wait begin timer="+System.currentTimeMillis());
				wait(10000);
				System.out.println("wait end   timer="+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void notifyMethod(){
		synchronized(this){
			System.out.println("notify begin timer="+System.currentTimeMillis());
			notify();
			System.out.println("notify end   timer="+System.currentTimeMillis());
		}
	}
}
