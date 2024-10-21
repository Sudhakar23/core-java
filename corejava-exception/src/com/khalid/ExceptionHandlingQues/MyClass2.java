package com.khalid.ExceptionHandlingQues;

public class MyClass2 {
public static void main(String[] args) throws A{
	try {
		f();
	
	}catch (A e) {
		throw e;
	
	} finally{
		System.out.println("done");
	}
}
public static void f()throws B{
	throw new B();
}
}
class A extends Throwable{}
class B extends A{}

