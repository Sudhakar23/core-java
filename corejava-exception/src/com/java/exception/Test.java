package com.java.exception;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		int d = t.m1();
		System.out.println(d);
		System.out.println("End of program");
	}
	int m1(){
		int a = 12;
		int b = 0;
		
		int c;
		try {
			c = a/0;
			//return c;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Cant divide by zero");
		}
		finally{
			System.out.println("This is finally block");
			return 100;
		}
	}
}
