package com.quest.singleton;

public class MyObject {
	private volatile static MyObject myObject;
	
	private MyObject(){
	}
	/** 
	 * @Title: getInstance
	 * @Description: DCL双检查锁机制，高效的解决了“懒汉模式”带来的多线程问题。
	 * @author ganshimin@zhongzhihui.com
	 * @return  
	 */  
	public static MyObject getInstance(){
		try {
			if(myObject == null){
				Thread.sleep(3000);
				synchronized(MyObject.class){
					if(myObject == null){
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
