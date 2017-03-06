package com.quest.pipeStreamTest;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
	public static void main(String[] args) {
		try {
			WriteData wirteData = new  WriteData();
			ReadData readData = new ReadData();
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream input = new PipedInputStream();
			out.connect(input);
			ThreadRead threadRead = new ThreadRead(readData, input);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite = new ThreadWrite(wirteData, out);
			threadWrite.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
