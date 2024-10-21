package com.scjp;

class X {
	void do2() {
		System.out.println("super class");
	}
}

class Y extends X {
	void do2() {
		System.out.println("subclass ");
	}
}

public class Chrome {
	public static void main(String[] args) {
		
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		
		 x2.do2();
		(Y)x2.do2();
		((Y)x2).do2();
	}
}
