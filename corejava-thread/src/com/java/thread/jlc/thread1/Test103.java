package com.java.thread.jlc.thread1;

public class Test103 {

	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		Thread th2 = Thread.currentThread();
		System.out.println("Current Thread :"+th1);
		int i = th1.getPriority();
//		System.out.println("Priority : "+i);
//		String str = th1.getName();
//		System.out.println("Name : "+th1.getName());
//		System.out.println("Thread ID : "+th1.getId());
//		System.out.println("Thread ID : "+th2.getId());
		
		System.out.println("----------------------------------------");
		ThreadGroup tg = th1.getThreadGroup();
		System.out.println("Thread Group : "+tg.getName());
		System.out.println("Thread Group : "+tg);
		System.out.println("Thread Group : "+Thread.currentThread().getThreadGroup().getName());

		/*System.out.println(
				Thread.currentThread().getName()
				+" :Under The Thread Group "
				+Thread.currentThread().getThreadGroup().getName()
				);
		*/
		
		th1.setName("JLC-1");
//		System.out.println("Current Thread1 : "+th1);
//		System.out.println("Current Thread2 : "+th2);
//		System.out.println(th1.equals(th2));
		System.out.println(th1==th2);
		System.out.println(th1.equals(th2));
		
//
//		System.out.println(th1.currentThread());
//		System.out.println(th1.currentThread());
//		System.out.println(Thread.currentThread().getThreadGroup().getName());			

	}
 
}
