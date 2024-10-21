package com.scjp.thread;
class K{
	void m1(){System.out.println("uuu");}
	void m2(){System.out.println("hhhh");}
}
class L extends K{
	void m2(){System.out.println("kkkkk");}
}
public class PolyScjp {
public static void main(String[] args) {
	//K k=new K();
	//k.m1();
	K k1=new L();
	k1.m2();
	L l=new L();
	//l.m1();
	//l.m2();
}
}
