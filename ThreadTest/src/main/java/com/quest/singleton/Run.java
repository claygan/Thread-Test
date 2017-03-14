package com.quest.singleton;

public class Run {

	public static void main(String[] args) {
		new Thread(){

			@Override
			public void run() {
				System.out.println(MyObject2.getInstance().hashCode());
			}
		}.start();
		new Thread(){
			
			@Override
			public void run() {
				System.out.println(MyObject2.getInstance().hashCode());
			}
		}.start();
		new Thread(){
			
			@Override
			public void run() {
				System.out.println(MyObject2.getInstance().hashCode());
			}
		}.start();
	}

}
