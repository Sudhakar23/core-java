package com.java.jlc.p1;

class Hello{

	int a, b;
	static int c = 30;
	Hello(){
		System.out.println("Default Const");
	}
	Hello(int a, int b){
		System.out.println("Two para Const");
		this.a=a; this.b = b;		
	}
	
}

public class Test88 {

	public static void main(String[] args) {
	
		Hello h1 = new Hello();
		Class cls = h1.getClass();
		 System.out.println(cls);
		 String str = cls.getName();
		 System.out.println(str);
		/* System.out.println(h1);
		 System.out.println(h1.toString());
		 System.out.println(h1.hashCode());*/

		 Hello h2 = new Hello(100,200);
		 
		 System.out.println(h2.hashCode());
		 
		 System.out.println(h1.hashCode()==h2.hashCode());
		 System.out.println(h1.equals(h2));
	}
}