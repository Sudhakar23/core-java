package com.core.innerclasstest;

class Outer {
	static int a = 12;
	interface InnerI {
		int a = 12;
		void intermethod();
	}
	class Inner1 implements InnerI {
		private int b = 23;
		{
			System.out.println("IB in InnerI1");
		}
		Inner1() {
			System.out.println("const-- Inner1");
		}
		public void intermethod() {
			System.out.println("private " +b);
		}
	}
	class Inner2 extends Inner1 {
		Inner2() {
			System.out.println("const-- Inner2");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		Outer.Inner2 oi = new Outer().new Inner2();
		oi.intermethod();
	}

}
