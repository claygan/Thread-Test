package com.quest.staticSingleton;

/** 
 * @ClassName: MyObject
 * @Description: 静态代码块实现单例模式
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年3月14日 下午3:50:40
 */  
public class MyObject {
	private static MyObject instance = null;
	private MyObject(){}
	static{
		instance = new MyObject();
	}
	public static MyObject getInstance(){
		return instance;
	}
}
