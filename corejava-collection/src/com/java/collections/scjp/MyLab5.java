package com.java.collections.scjp;
class Hai{
	void m7(){System.out.println("ttt");}
}
class Hello7 extends Hai{
	void m7(){System.out.println("rrr");}
}
public class MyLab5 {
public static void main(String[] args) {
	Hai h=new Hello7();
	h.m7();
}
}
