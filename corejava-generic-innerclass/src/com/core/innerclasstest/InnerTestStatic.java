package com.core.innerclasstest;
class Outer1 {
	int a = 12;
	static int b = 34;
	static class Inner1{
		int a = 12;
		static{
			System.out.println("Inside Inner SB");
		}
		{
			System.out.println("Inside Inner IB");
		}
		void innerm(){
			System.out.println(b);
		}
	}
	class Inner2 extends Inner1{
		
	}
}
public class InnerTestStatic {
	public static void main(String[] args) {
//		Outer1.Inner2 oi = new Outer().new Inner2();
//		System.out.println(Outer1.Inner1.a); 
	}
}
