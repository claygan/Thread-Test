package com.quest.synchronize.volatileTest;

public class Run {

	public static void main(String[] args) {
		MyThread[] threadArr = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			threadArr[i] = new MyThread();
		}
		for (int i = 0; i < 100; i++) {
			threadArr[i].start();
		}
	}

}
