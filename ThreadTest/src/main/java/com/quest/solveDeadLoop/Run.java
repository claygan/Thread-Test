package com.quest.solveDeadLoop;

/**
 * @author Quest
 * 通过代码块的方式来解决等待无限循环无法释放的锁的问题
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.start();
		b.start();
	}

}
