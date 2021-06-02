package com.java.thread.jlc.thread1;

class HelloThread extends Thread{
	public HelloThread(){
		super();
		start();

	}
	HelloThread(String tname){
		super(tname);
		start();
		try {

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	HelloThread(ThreadGroup tg, String tname){
		super(tg, tname);
		start();		
	}
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println(
					Thread.currentThread().getName()
					+"Under the Thread group of :"
					+Thread.currentThread().getThreadGroup().getName()
			);
		}
	}	
}

public class Test106 {

	public static void main(String[] args) {
		System.out.println("***In Test106***");
		ThreadGroup tg = new ThreadGroup("TGroup");
		HelloThread ht1 = new HelloThread();
		System.out.println(ht1.getPriority());
//	
//		HelloThread ht2 = new HelloThread("Ch-jlc-1");
////		HelloThread ht3 = new HelloThread(tg, "Ch-jlc-2");
//		System.out.println("from main : "+ht1.currentThread().getId());
//		
//		System.out.println(ht2.getId());
////		System.out.println(ht3.currentThread().getId());
//		/*for(int i = 0;i<5;i++){
//			System.out.println(
//					Thread.currentThread().getName()
//					+"Under the Th Grp of "
//					+Thread.currentThread().getThreadGroup().getName()
//			);
//		}*/
	}
}


