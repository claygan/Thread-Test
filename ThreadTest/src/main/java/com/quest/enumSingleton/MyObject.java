package com.quest.enumSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {
	public enum MyEnumSingleton{
		connectionFactory;
		private Connection connection;
		private MyEnumSingleton(){
			try {
				System.out.println("调用了MyObject的构造");
				Class.forName("com.mysql.jdbc.Driver");
				String url = "mysql://192.168.1.10:3306/zzh_client_demo?useUnicode=true&characterEncoding=UTF-8";
				String username = "zzh";
				String password = "123456";
				connection = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public Connection getConnection(){
			return connection;
		}
	}
	public static Connection getConnection(){
		return MyEnumSingleton.connectionFactory.getConnection();
	}
}
