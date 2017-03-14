package com.quest.staticSingleton;

public class Run {

	public static void main(String[] args) {
		new Thread(){

			@Override
			public void run() {
				System.out.println(MyObject.getInstance().hashCode());
			}
		}.start();
		new Thread(){
			
			@Override
			public void run() {
				System.out.println(MyObject.getInstance().hashCode());
			}
		}.start();
		new Thread(){
			
			@Override
			public void run() {
				System.out.println(MyObject.getInstance().hashCode());
			}
		}.start();
	}

}
