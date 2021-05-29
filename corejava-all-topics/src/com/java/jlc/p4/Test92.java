package com.java.jlc.p4;
class Hai{
	int a ;
	Hai(){		
	}
	Hai(int a){
		this.a=a;
	}
}
class Hello implements Cloneable{
	int b;
	Hai hai = null;
	Hello(int a, Hai hai){
		System.out.println("two para");
		this.b=b;
		this.hai=hai;
	}
	void show(){
		System.out.println("Show in Hello");
		System.out.println("Hai of " +hai.a);
		System.out.println("b : " +b);
	}
	public Hello myClone(){
		Hello h = null;
		try{
			h = (Hello)this.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("lava.lang.clone " +e);
		}
		return h;
	}
}

public class Test92 {

	public static void main(String[] args) {
		Hai hai = new Hai(100);
		Hello h1 = new Hello(200, hai);
		Hello h2 = h1.myClone();
	//	h1.show();
	//	h2.show();
	//	System.out.println(h1 == h2);
	//	System.out.println(h1.hai == h2.hai);
		System.out.println("****After the change****");
		h1.b=101;
		h1.show();
		h2.show();
	/*	h2.b=303;
		h1.show();
		h2.show();
		h1.hai.a=111;
		h2.show();	*/		
	}
}
