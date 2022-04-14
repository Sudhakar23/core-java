package com.java.myprog;

public class Swap1 {
	public static void main(String[] args) {
		int a = 10, b = 20, c;
		c = b;
		b = a;
		a = c;
		System.out.println("a==" + a);
		System.out.println("b==" + b);
		Swap1 s = new Swap1();
		/*
		 * s.swap(); System.out.println(s.a);
		 */

	}
	/*
	 * void swap(){
	 * 
	 * c=b; b=a; a=c;
	 * 
	 * System.out.println(a); 
	 * System.out.println(b); }
	 */
}
