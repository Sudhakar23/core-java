package com.core.lambda.durga;

interface SMInterface{
	public static void m1() {
		System.out.println("Calling static method m1 from interface SMIinterface.");
	}
	public static void m2() {
		System.out.println("Calling static method m2 from interface SMIinterface.");
	}
}
public class StaticMethodInterfaceDemo implements SMInterface{
//	public static void m1() {
//		System.out.println("Calling static method m1 from class StaticMethodInterfaceDemo .");
//	}
	
	public static void main(String[] args) {
		
		//Only Interface name is allowed to call interface static method.
		SMInterface.m1(); 
		SMInterface.m2(); 
		
		//StaticMethodInterfaceDemo.m1(); //Error
	}
}
