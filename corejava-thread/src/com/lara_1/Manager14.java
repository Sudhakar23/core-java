package com.lara_1;
class L extends Thread{
	
}
public class Manager14 {
public static void main(String[] args) {
	L l=new L();
	System.out.println(l.getName());
	System.out.println(l.getId());
	System.out.println(l.getPriority());
	System.out.println(l.isDaemon());
}
}
