package com.java.corejava;
class A{
	A(){
		System.out.println("A in def");
	}
}
class B extends A{
B(){
	//super();
	System.out.println("b in def");
}	
}
public class Ques15  {
public static void main(String[] args) {
B b1=new B();	
}
}
