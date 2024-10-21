package com.lara.thread.exercise2;
/*class F extends Thread{
	F(String s){super(s);}
}
class G1 implements Runnable{
	public void run(){System.out.println("run");}
}*/
public class Manager22 {
public static void main(String[] args) {
	/*F f1=new F("fist");
	f1.start();
	G1 g1=new G1();
	Thread th=new Thread();
	th.start();
	th.run();
	
	System.out.println(f1.getName());
	System.out.println(th.getName());
*/	
	Thread t1=Thread.currentThread();
	System.out.println(t1.getPriority());
	t1.setPriority(10);
	System.out.println(t1.getPriority());
}
}
