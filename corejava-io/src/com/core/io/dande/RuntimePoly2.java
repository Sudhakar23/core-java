package com.core.io.dande;
 class A{}
 class B extends A{}
public class RuntimePoly2 {
public static void main(String[] args) {
//	Object o = new Object();
//	Test7 t = (Test7)o;
	
	A a1 = new B();
	B b1 = (B)a1;
	
	System.out.println("Done");
   }
}