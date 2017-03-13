package com.quest.synchronize.innerClass;

import com.quest.synchronize.innerClass.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("curry");
		publicClass.setPassword("142857");
		System.out.println(publicClass.getUsername() +" : "+ publicClass.getPassword());
		//实例化内置类必须采用这种方式
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("age28");
		privateClass.setAddress("address hangzhou bingjiang");
		System.out.println(privateClass.getAge() + " : "+ privateClass.getAddress());
		
	}

}
