package com.java.jlc.oldcore;
class Hello48{
	private int a = 10;
	int b = 20;
	void m1(){
		//private int a11 = 11;
		System.out.println("M1 in Hello");
		{
			int a = 33;
			
		}
		System.out.println(a +" " +this.a +" " +b);
	}	
}
class Test48{
	public static void main(String arg[]){
		Hello48 h = new Hello48();
		System.out.println(h.b);
		h.m1();
	}
}
