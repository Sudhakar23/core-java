package com.java.jlc.oldcore;
class Hai51{
	int x;
}
class Hello51{
	void m1(int a){
		a = a + 100;
		System.out.println(a);
	}
	void m2(Hai51 hai){
		hai.x = hai.x + 100;
	}
}
class Test51{  
	public static void main(String arg[]){
		Hai51 hai = new Hai51();
		Hello51 h1 = new Hello51();
		//System.out.println("Value of x " +hai.x);
		//h1.m1(111);
		System.out.println("Value of x " +hai.x);
		h1.m2(hai);
		System.out.println("Value of x " +hai.x);
		//int p = 10;
		System.out.println("In Main");
		//System.out.println("value of p :" +p);
		System.out.println("Value of x " +hai.x);
		//h1.m1(p);
		h1.m2(hai);
		//System.out.println("value of p :" +p);
		System.out.println("Value of x " +hai.x);
	}
}