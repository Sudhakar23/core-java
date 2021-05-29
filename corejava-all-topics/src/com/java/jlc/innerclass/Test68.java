package com.java.jlc.innerclass;
class Outer1{ // Non Static Inner Class
	interface I1{
		void m1();
		public abstract void m2();
	}
	interface I2{
		void m22();
	}
	abstract class Inner1{
		abstract void m33();
	}
	class Inner2 extends Inner1 implements I1,I2{
		public void m1(){
			System.out.println("M1 in Inner2");
		}
		public void m2(){
			System.out.println("M2 in Inner2");
		}
		public void m22(){
			System.out.println("M22 in Inner2");
		}
		void m33(){
			System.out.println("M33 in Inner2");
		}
	} // Inner 2
	void show(){
		System.out.println("**Show in Outer**");
		I1 i1 = new Inner2();
		i1.m1();
		i1.m2();
		//i1.m22();
		I2 i2 = new Inner2();
		i2.m22();
		//i2.m1();
		Inner1 inr1 = new Inner2();
		inr1.m33();
	}
}

public class Test68{
	public static void main(String arg[]){
		Outer1 otr = new Outer1();
		/*Outer.I1 oi1 = new Outer().new Inner2();
		oi1.m1();*/
		Outer1.I2 oi2 = new Outer1().new Inner2();
		oi2.m22();
		otr.show();
	}
}