package com.quest.synchronize.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author Quest
 * 字符流写入
 *
 */
public class WriteData {
	public void writeMethod(PipedWriter out){
		try {
			System.out.println("writer :");
			String str = "这是一首简单的小情歌，唱着人们心中的曲折ada";
			out.write(str);
			System.out.println("写入的数据："+str);
			System.out.println();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
