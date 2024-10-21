package com.java.thread.lara.thread.sync;
class R {
	synchronized static void r(){
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
	
}
class Thread8 extends Thread{
	public void run(){
		 R.r();
	 }
}
class Thread9 extends Thread{
	public void run(){
		R.r();
	}
}
public class Test1 {
public static void main(String[] args) {
	//R r1=new R();
	Thread8 th8=new Thread8();
	Thread9 th9=new Thread9();
	th8.start();
	th9.start();
	
}
}
