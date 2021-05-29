package com.java.exception;
class Hello{
	int m1(String s){
		try{
			int x = Integer.parseInt(s);
			int y = 10/x;
			System.out.println(y);
			//System.exit(0);
			return y;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
//		System.out.println("between catch");
		catch(Error e){
			System.out.println(e);
		}
		System.out.println("between catch");
	/*	finally{
			System.out.println("Resource cleanup can be done here-prefer me than finalize()");
			System.out.println("I am Ok");
		}
*/		System.out.println("I am not Ok");
		return 99;
	}
	void m2(){
		try{
			
			int x = 10/0;			
		}
		finally{
			System.out.println("I am inside finally block");
		}
		
		System.out.println("I am outside finally block");
		//return 10;
	}
}

public class Lab4 {

	public static void main(String[] as) {
		System.out.println("***Main Begin***");
		Hello h = new Hello();
		int s = h.m1(as[0]);
		h.m2();
		//System.out.println(s);
		System.out.println("main end");
	}
}
