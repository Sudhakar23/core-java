package com.java.exception;

import java.io.EOFException;
import java.io.IOException;

public class Propagate {

	public static void main(String[] args)throws NullPointerException{
//		int a ; int b = 0;
		int a = Integer.parseInt("two");
		System.out.println(++a);
//		try {
//			stringTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		m1();
//		System.out.println("End of Program");
	}

	public static void stringTest() throws NullPointerException{
		String str = null;
		if(str == null){
		System.out.println(str.toLowerCase());
		throw new NullPointerException();
		}
	}
	public static  void m1(){
		System.out.println("M1 method");
	}
}