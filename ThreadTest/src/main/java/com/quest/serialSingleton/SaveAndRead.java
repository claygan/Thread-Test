package com.quest.serialSingleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndRead {

	public static void main(String[] args) {
		MyObject myObject = MyObject.getInstance();
		//写入输出对象流
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File("myObjectFiile.txt"));
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(myObject);
			outputStream.close();
			fileOutputStream.close();
			System.out.println(myObject.hashCode());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//读取对象流
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("myObjectFiile.txt"));
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			MyObject object = (MyObject)inputStream.readObject();
			fileInputStream.close();
			inputStream.close();
			System.out.println(object.hashCode());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
