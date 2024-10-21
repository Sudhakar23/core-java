package com.java.jlc.oldcore;
class Hello55{
	void m1(){
	System.out.println("m1 in Hello");
	}
	void m2(){
	System.out.println("m2 in Hello");
	}
	void m3(){
	System.out.println("m3 in Hello");
//	return 10;
	}
	}
class Hai55 extends Hello55{
	
	void m2(){
	System.out.println("m2 in Hai");
		super.m2();
	}
	void m3(){
	System.out.println("m3 in Hai");
//		return 10;
	}
}
class Test55{
	public static void main(String arg[]){
	Hai55 hai = new Hai55();
	//hai.m1();
	//hai.m2();
	}	
}