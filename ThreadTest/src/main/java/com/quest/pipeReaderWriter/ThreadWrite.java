package com.quest.pipeReaderWriter;

import java.io.PipedWriter;

public class ThreadWrite extends Thread {
	private WriteData writeData;
	private PipedWriter writer;
	public ThreadWrite(WriteData writeData, PipedWriter writer) {
		super();
		this.writeData = writeData;
		this.writer = writer;
	}
	@Override
	public void run() {
		writeData.writeMethod(writer);
	}
	
	
}
