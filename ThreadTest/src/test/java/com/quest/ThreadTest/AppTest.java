package com.quest.ThreadTest;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

		@Test
		public void test(){
			String link = "/index.htm";
//			link = link.substring(0, link.lastIndexOf("/")) +"/**/*";
			System.out.println(link);
			System.out.println(link.indexOf("index"));
//			if(link.indexOf("index")){
//				System.out.println("success");
//			}
			
		}
}
