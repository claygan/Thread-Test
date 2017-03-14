package com.quest.serialSingleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class MyObject implements Serializable{

	/** 
	 * @Description: 序列化传递的对象不经过处理，是无法保证单例的
	 */  
	private static final long serialVersionUID = -941898055742152542L;
	
	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}
	private MyObject(){
	}
	public static MyObject getInstance(){
		return MyObjectHandler.myObject;
	}
	//解决反序列化出现多例的问题，使用readResolve方法，只需要加上该方法，无需做其他处理（？）
	protected Object readResolve() throws ObjectStreamException{
		System.out.println("调用了readResolved方法");
		return MyObjectHandler.myObject;
	}
	
}
