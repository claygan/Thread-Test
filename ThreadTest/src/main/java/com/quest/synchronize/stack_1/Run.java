package com.quest.stack_1;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		P p1 = new P(myStack);
		P p2 = new P(myStack);
		P p3 = new P(myStack);
		P p4 = new P(myStack);
		P p5 = new P(myStack);
		P p6 = new P(myStack);
		C c1 = new C(myStack);
		C c2 = new C(myStack);
		C c3 = new C(myStack);
		C c4 = new C(myStack);
		C c5 = new C(myStack);
		C c6 = new C(myStack);
		C c7 = new C(myStack);
		P_Thread p_Thread = new P_Thread(p);
		p_Thread.start();
		P_Thread p_Thread1 = new P_Thread(p1);
		p_Thread1.start();
		P_Thread p_Thread2 = new P_Thread(p2);
		p_Thread2.start();
		P_Thread p_Thread3 = new P_Thread(p3);
		p_Thread3.start();
		P_Thread p_Thread4 = new P_Thread(p4);
		p_Thread4.start();
		P_Thread p_Thread5 = new P_Thread(p5);
		p_Thread5.start();
		P_Thread p_Thread6 = new P_Thread(p6);
		p_Thread6.start();
		C_Thread c_Thread1  = new C_Thread(c1);
		C_Thread c_Thread2  = new C_Thread(c2);
		C_Thread c_Thread3  = new C_Thread(c3);
		C_Thread c_Thread4  = new C_Thread(c4);
		C_Thread c_Thread5  = new C_Thread(c5);
		C_Thread c_Thread6  = new C_Thread(c6);
		C_Thread c_Thread7  = new C_Thread(c7);
		c_Thread1.start();
		c_Thread2.start();
		c_Thread3.start();
		c_Thread4.start();
		c_Thread5.start();
		c_Thread6.start();
		c_Thread7.start();
	}
}
