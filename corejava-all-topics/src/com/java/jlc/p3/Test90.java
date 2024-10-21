package com.java.jlc.p3;
class Hello{
	int m1(int a, int b){
		System.out.println("M1(a,b)");
		try {
			int i = a/b;
			return i;
		} catch (ArithmeticException e){
			System.out.println("Provide No" +e);
		}finally{
			System.out.println("I am inside Finally");
			return 10;
		}		 
		//System.out.println("I am outside finally");
		//return 10;
		
	}
}
public class Test90 {
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.m1(12,0));

	}

}
