package com.java.thread.jenkov;

public class InheritableThreadLocalBasic {
	public static void main(String[] args) {
		ThreadLocal<String> threadLocal = new ThreadLocal();
		InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal();
		
		Thread thread1 = new Thread(()->{
			System.out.println("========Thread1===========");
			threadLocal.set("Thread1 -- ThreadLocal");
			inheritableThreadLocal.set("Thread1 -- InheritableThreadLocal");
			
			System.out.println(threadLocal.get());
			System.out.println(inheritableThreadLocal.get());
			
			Thread childThread = new Thread(() ->  {
				System.out.println("========ChildThread===========");
				System.out.println(threadLocal.get());	//null since threadLocal is set by other thread
				System.out.println(inheritableThreadLocal.get()); // inheritableThreadLocal will be visible here 
			});
			childThread.start();
		});
		thread1.start();
		
		Thread thread2 = new Thread(()->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("========Thread2===========");
			System.out.println(threadLocal.get());		// null since threadLocal is set by other thread
			System.out.println(inheritableThreadLocal.get()); // null since inheritableThreadLocal is set by other thread
		});
		thread2.start();
	}
}
