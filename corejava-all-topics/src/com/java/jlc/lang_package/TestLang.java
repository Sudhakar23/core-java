package com.java.jlc.lang_package;

class Hello{
	int a, b;
	static int c = 0;
	Hello(){
		System.out.println("Default constructor");
	}
	Hello(int a, int b){
		System.out.println("2 para");
		this.a = a;
		this.b = b;
	}	
}
public class TestLang {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Class cls = h1.getClass();
		String str = cls.getName();
		System.out.println(cls);
		System.out.println(str);
		System.out.println(h1);
		System.out.println(h1.toString());
		
		Hello h2 = new Hello();
		System.out.println("h2 : " +h2);
		System.out.println("h2.toString : "+h2.toString());
		System.out.println("h1.hashCode() : " +h1.hashCode());
		System.out.println("h1.hashCode() : " +h2.hashCode());
		System.out.println("h1.equals(h2) :" +h1.equals(h2));
		System.out.println(h1.hashCode() == h1.hashCode());
		
	}
}
