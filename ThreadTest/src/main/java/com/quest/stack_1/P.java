package com.quest.stack_1;

/**
 * @author Quest
 * 生产者
 *
 */
public class P {
	private MyStack myStack;

	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	public void pushService(){
		myStack.push();
	}
}
