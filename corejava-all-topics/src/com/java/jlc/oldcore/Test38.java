package com.java.jlc.oldcore;
class Hello38{
	void m1(int a){
	  System.out.println("m1(int a)");
	}
	void m1(int ...a){
	  System.out.println("m1(int ...a)");
	  System.out.println(a.length);
	  for(int i:a)
	    System.out.println(i);
	}
	void m2(double d, int...a){
	  System.out.println("sum(int a, int b)");
	}
	int sum(double d, int a){
	  System.out.println("sum(double d, int a)");
	  return 12;
	} 
		
}
class Test38{
  public static void main(String args[]){
    Hello38 h = new Hello38();
	h.m1(12);
  }
}