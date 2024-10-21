package com.java.jlc.oldcore;
class Hello45{
	int a, b;
	static int c = 30;
	Hello45(int a, int b){
		//this(222);
		System.out.println("2nd para");
		this.a = a; this.b=b;
	}
	Hello45(int a){
		//this();
		this(888,777);
		System.out.println("1 para");
		this.a = a;
	}
	Hello45(){
		this(999);
		//this(888,777);
	}
	void show(){
		int a = 11, b = 22, c = 33;
		System.out.println("Show in Hello");
		System.out.println(a +" "+b +" "+ c );
		System.out.println(this.a +" "+this.b +" "+this.c);		
	}
}
class Test45{
	public static void main(String arg[]){
		Hello45 h = new Hello45();
		h.show();
	}
}
