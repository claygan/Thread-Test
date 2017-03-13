package com.quest.synchronize.stack_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Quest
 * @deprecated:生产者消费者模式：操作栈（每次list最大容量是1，适用于多生产多消费，不会出现假死）
 *
 */
public class MyStack { 
	private List list = new ArrayList();
	synchronized public void push(){
		try {
			while(list.size() == 1){
				this.wait();
			}
			list.add("anyString="+Math.random());
			this.notifyAll();
			System.out.println("push="+list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public String pop(){
		String returnValue = "";
		try {
			while(list.size() == 0){
				System.out.println("pop操作中的："+Thread.currentThread().getName()+"线程呈wait状态");
				this.wait();
			}
			returnValue = ""+list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop="+list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
