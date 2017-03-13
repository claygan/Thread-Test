package com.quest.lock.reentrantReadWriteLockTest;

/** 
 * @ClassName: Run
 * @Description: 读写锁：读锁（共享锁）：不同线程可以同时进行读取操作；写锁（排它锁）：同一时刻只能允许一个Thread进行写入操作
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年3月9日 下午4:42:01
 */  
public class Run {
	public static void main(String[] args) {
		final Service service = new Service();
		Thread a = new Thread(){
			public void run(){
				service.read();
			}
		};
		a.setName("A");
		a.start();
		
		Thread b = new Thread(){
			public void run(){
				service.read();
			}
		};
		b.setName("B");
		b.start();
		
		Thread c = new Thread(){
			public void run(){
				service.write();
			}
		};
		c.setName("C");
		c.start();
		
		Thread d = new Thread(){
			public void run(){
				service.write();
			}
		};
		d.setName("D");
		d.start();
	}
}
