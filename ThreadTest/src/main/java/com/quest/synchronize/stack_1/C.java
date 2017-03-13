package com.quest.synchronize.stack_1;

/**
 * @author Quest
 * 消费者
 *
 */
public class C {
	private MyStack myStack;

	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	public void popService(){
		System.out.println(Thread.currentThread().getName()+"=>C_pop:"+myStack.pop());
	}
}
