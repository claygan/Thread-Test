package com.quest.pipeReaderWriter;

import java.io.PipedReader;

public class ThreadRead extends Thread {
	private ReadData data;
	private PipedReader reader;
	public ThreadRead(ReadData data, PipedReader reader) {
		super();
		this.data = data;
		this.reader = reader;
	}
	@Override
	public void run() {
		data.ReadMethod(reader);
	}
	
}
