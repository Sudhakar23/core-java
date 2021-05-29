package com.r.thread;
class E1 extends Thread{}
public class Manager21 {
public static void main(String[] args) {
	E1 e1=new E1();
	e1.setName("sudhakar");
	e1.start();
	E e2=new E();
	e2.setName("second name");
	e2.start();
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getPriority());
	System.out.println(e1.isDaemon());
	System.out.println("-------");
	System.out.println(e2.getId());
	System.out.println(e2.getName());
	System.out.println(e2.getPriority());
	System.out.println(e2.isDaemon());
}
}
