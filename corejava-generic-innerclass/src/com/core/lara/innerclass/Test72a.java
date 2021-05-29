package com.core.lara.innerclass;
class Outer44{
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
				class Inner2{
					void innerShow(){
						System.out.println("Show in innner inside innershow");
					}
				}
				Inner2 inr2 = new Inner2();
				inr2.innerShow();
				System.out.println("--------------------------------");
				System.out.println("Show in Inner inside method m1");
			}
		} // END inner class
		Inner inr = new Inner();
		inr.show();
	}
}

public class Test72a{
	public static void main(String arg[]){
		Outer44 otr = new Outer44();
		otr.m1();
		
		
	}
}