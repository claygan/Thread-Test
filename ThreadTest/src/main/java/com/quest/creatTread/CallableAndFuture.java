package com.quest.creatTread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	@SuppressWarnings("rawtypes")
	public static class MyCallable implements Callable{
		private int flag = 0;

		public MyCallable(int flag) {
			this.flag = flag;
		}

		@Override
		public String call() throws Exception {
			if (this.flag == 0) {
				return "flag = 0";
			}
			if(this.flag == 1){
				try {
					while(true){
						System.out.println("looping...");
						Thread.sleep(2000);
					}
				} catch (InterruptedException  e) {
					System.out.println("Interrupted!");
				}
				return "false";
			}else{
				throw new Exception("bad flag value!");
			}
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//定义三个Callable任务
		MyCallable task1 = new MyCallable(0);
		MyCallable task2 = new MyCallable(1);
		MyCallable task3 = new MyCallable(2);
		//创建一个执行任务的服务
		ExecutorService es = Executors.newFixedThreadPool(3);
		try {
			// 提交并执行任务，任务启动时返回了一个Future对象，
			// 如果想得到任务执行的结果或者是异常可对这个Future对象进行操作
			Future f1 = es.submit(task1);
			// 获得第一个任务的结果，如果调用get方法，当前线程会等待任务执行完毕后才往下执行
			System.out.println("Task1:"+f1.get());
			
			Future f2 = es.submit(task2);
			// 等待5秒后，再停止第二个任务。因为第二个任务进行的是无限循环
            Thread.sleep(5000);
			System.out.println("Task2 cancel:"+f2.cancel(true));
			
			// 获取第三个任务的输出，因为执行第三个任务会引起异常
            // 所以下面的语句将引起异常的抛出
			Future f3 = es.submit(task3);
			System.out.println("Task3:"+f3.get());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		es.shutdownNow();
	}
}
