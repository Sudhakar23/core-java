package com.core.lambda.durga;

interface StaticMethodInterface{
	public static void m1() {
		System.out.println("Calling static method m1 from interface SMIinterface.");
	}
	public static void m2() {
		System.out.println("Calling static method m2 from interface SMIinterface.");
	}
}
public class StaticMethodInterfaceDemo implements StaticMethodInterface{
//	public static void m1() {
//		System.out.println("Calling static method m1 from class StaticMethodInterfaceDemo .");
//	}
	
	public static void main(String[] args) {
		
		//Only Interface name is allowed to call interface static method.
		StaticMethodInterface.m1(); 
		StaticMethodInterface.m2(); 
		
		//Through implmentraion class refrerence static interface mathod cannot be called.
//		StaticMethodInterfaceDemo.m1(); //Error
	}
}
