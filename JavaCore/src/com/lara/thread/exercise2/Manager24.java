package com.lara.thread.exercise2;

public class Manager24 {
public static void main(String[] args) {
	class R1 extends Thread{}
	R1 r=new R1();
	System.out.println(r.getPriority());
	Thread t1=Thread.currentThread();
	t1.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t1);
	R1 a2=new R1();
	System.out.println(a2);
	System.out.println(a2.getPriority());
}
}
