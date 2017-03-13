package com.quest.joinTest;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			myThread.join();//作用：使所属的线程对象X正常执行run方法中的任务，而使当前线程Z无限期阻塞，等待线程X销毁后再继续执行线程Z的后面的代码
			System.out.println("处理完了其他线程的内容，现在来处理主线程的内容了~");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
