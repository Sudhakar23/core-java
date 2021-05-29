package com.java.polymorphism;
class C11{
	int i;
	C11(int i){this.i=i;}
}
public class Prog14 {
public static void main(String[] args) {
	C11 c1=new C11(10);
	//C11 c2=new C11(10);
	C11 c2=c1;
	System.out.println(c1==c2);
	System.out.println(c1.equals(c2));
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
}
}
