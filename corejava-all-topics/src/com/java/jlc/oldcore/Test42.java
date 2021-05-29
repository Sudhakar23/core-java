package com.java.jlc.oldcore;
class A42{
	A42 a2 = null;
	void m1(){
	  System.out.println("M1 in A");
	}
}
class Test42{	
  public static void main(String args[]){
    A42 a1 = new A42();
	A42 a2 = new A42();
	a1.a2 = a2;
	a1.m1();
	a1.a2.m1();
	System.out.println("Main in B");	  
  }
}