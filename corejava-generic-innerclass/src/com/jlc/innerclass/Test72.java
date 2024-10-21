package com.jlc.innerclass;
class Outer4{
	int a = 10;
	static int b = 20;
	void m1(){
		int a1 = 101;
		final int b1 = 20;
		System.out.println("M1 in Outer Class");
		class Inner{	// Inner class
			int a11 = 10;
			static final int b11 = 30;
			final int c11 = 303;
			void show(){
				System.out.println("Show in Inner inside method m1");
				System.out.println(a);
				System.out.println(b);
				//System.out.println(a1);
				System.out.println(b1);
				System.out.println(a11 +" " +c11);
			}
		} // END inner class
		Inner inr = new Inner();
		inr.show();
	}
}

public class Test72{
	public static void main(String arg[]){
		Outer4 otr = new Outer4();
		otr.m1();
	}
}