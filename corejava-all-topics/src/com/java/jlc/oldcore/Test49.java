package com.java.jlc.oldcore;
class Hello49{
	int a = 10, b = 20;
	static int c = 30;
	void m1(){
		System.out.println("M1 in Hello");
	}
	static void m2(){
		System.out.println("M2 in Hello");
	}
	static void m22(Hello49 h){
		System.out.println("M22 in Hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println("Global :" +c);
		//m1();
		System.out.println(h.a);
		System.out.println(h.a);
		System.out.println(h.b);
		System.out.println(Hello49.c);
		h.m1();
	}
}
class Test49{
	static{
			System.out.println("SB in test49");
			//new Hello().m22(new Hello());			
	}
	public static void main(String arg[]){
		/*new Hello();
		Hello h =new Hello();*/
		Hello49 hello = new Hello49();
		System.out.println(hello.a);
		//Hello Test49 = new Hello();
		Hello49.m22(hello); 
	}
}
