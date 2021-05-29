package com.java.polymorphism;
class A111{
	int i;
}
public class Prog12 {
public static void main(String[] args) {
A111 a1=new A111();
a1.i=10;
A111 a2=new A111();	
a2.i=20;
A111 a3=a1;
System.out.println(a1==a2);
System.out.println(a2==a3);
System.out.println(a1==a3);
}
}
