package com.khalid.ExceptionHandlingQues;

import java.io.InterruptedIOException;

public class Myclass {
public static void main(String[] args) throws InterruptedException{
	int k=0;
	try {
		//int i=15/k;
		f();
		System.out.println("1");
	}/* catch (ArithmeticException e) {
		System.out.println("1");
	}catch (RuntimeException e) {
		System.out.println("2");
	}catch (Exception e) {
		System.out.println("3");
	}*/
	
	finally{
		System.out.println("4");
	}
	System.out.println("5");
}
static void f()throws InterruptedException{
//	try {
		throw new InterruptedException("time for lunch");
//	} catch (InterruptedIOException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}
