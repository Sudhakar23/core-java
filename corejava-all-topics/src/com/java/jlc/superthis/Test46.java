package com.java.jlc.superthis;
class Hello46{
	int a, b;
	static int c = 30;
	Hello46(int a, int b){
		this.a = a; this.b = b;
		System.out.println("Two arg para");
	}
	Hello46(int...a){
		this(a[0],a[1]);
		this.a = a[0];this.b = a[1];
		System.out.println("Hello(int...a)");
	}
	/*Hello(){
		System.out.println("Default constructor");
	}*/
	void m1(){
		int a = 11, b = 22, c = 33;
		System.out.println("M1 in Hello");
		System.out.println(a +" " +b +" " +c);
		System.out.println(this.a +" " +this.b);
	}
	static void m2(){
		int a = 10, b = 20, c = 30;
		System.out.println("M2 in hello");
		System.out.println(a +" " +b +" " +c );
		System.out.println(c);		
	}
}
class Test46{
	public static void main(String arg[]){
		Hello46 h = new Hello46();
		h.m1();
	}
}
