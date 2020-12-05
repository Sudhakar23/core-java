package com.core.lambda.durga;


interface I02{
	default void m1() {
		System.out.println("Default method declared in interface.");
	}
}
public class DefaultMethodDemo implements I02 {
	//Override interface default method
//	@Override
//	public void m1() {
//		System.out.println("Implementation part of default method.");
//	}
	
	public static void main(String[] args) {
		DefaultMethodDemo d = new DefaultMethodDemo();
		// If not overridden then default implementation will be called. 
		d.m1();
		
	}
}
