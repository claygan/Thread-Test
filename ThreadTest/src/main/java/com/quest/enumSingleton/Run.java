package com.quest.enumSingleton;

public class Run {

	public static void main(String[] args) {
		new Thread(){

			@Override
			public void run() {
				System.out.println(MyObject.getConnection().hashCode());
			}
		}.start();
		new Thread(){
			
			@Override
			public void run() {
				System.out.println(MyObject.getConnection().hashCode());
			}
		}.start();
		new Thread(){
			
			@Override
			public void run() {
				System.out.println(MyObject.getConnection().hashCode());
			}
		}.start();
	}

}
