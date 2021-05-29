package com.java.polymorphism;
class E{
	int i=10;
	//E(int i){this.i=i;}
	//public boolean equals(Object obj){return this==obj;}
}
public class Prog16 {
public static void main(String[] args) {
	E e1=new E();
	E e2=new E();
	E e3=e1;
/*	E e1=new E(90);
	E e2=new E(90);
	E e3=e1;
*/	System.out.println(e1.equals(e2));
	System.out.println(e2.equals(e3));
	System.out.println(e3.equals(e1));
	System.out.println(e3==e1);
}
}
