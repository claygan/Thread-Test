package com.quest.singleton;

public class MyObject2 {
	/** 
	 * @ClassName: MyObjectHandler
	 * @Description: 采用静态内部类的方式来实现单例模式
	 * @缺点：静态内部类可以解决 线程安全问题，但是如果遇到“序列化对象”时，使用默认的方式运行得到的结果还是多例的。
	 * 
	 * @author ganshimin@zhongzhihui.com
	 * @date: 2017年3月14日 下午1:50:50
	 */  
	private static class MyObjectHandler{
		private static MyObject2 myObject2 = new MyObject2();
	}
	private MyObject2(){}
	public static MyObject2 getInstance(){
		return MyObjectHandler.myObject2;
	}
}
