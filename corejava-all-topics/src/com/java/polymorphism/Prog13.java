package com.java.polymorphism;
class B111{
	int i;
}
public class Prog13 {
public static void main(String[] args) {
	B111 b1=new B111();
	B111 b2=new B111();
	B111 b3=b1;
	b1.i=b2.i=20;
	System.out.println(b1==b2);
	System.out.println(b2==b3);
	System.out.println(b3==b1);
	System.out.println(b1.i==b2.i);
	/*int i=9;
	int j=10;
	System.out.println(i==j);*/
}
}
