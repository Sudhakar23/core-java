package com.java.jlc.superthis;
class Hello45a{
	int a, b;
	static int c = 30;
	Hello45a(int a){
		//this();//this(888,777);
		System.out.println("1 para");
		this.a = ++a;
		System.out.println(this.a +" " +b);
	}
	Hello45a(){
		this(9);
		//this(888,777);
		System.out.println("Default Parameter");
		this.a = ++a;
		System.out.println(this.a);
		this.b = ++a;
		System.out.println(a +" "+ ++b);		
	}
	void show(){
		int a = 11, b = 22, c = 33;
		System.out.println("Show in Hello");
		System.out.println(a +" "+b +" "	+ c );
		System.out.println(this.a +" "+this.b +" "+this.c);		
	}
}
class Test45A{
	public static void main(String arg[]){
		Hello45a h = new Hello45a();
	//	h.show();
	}
}

