package com.java.stream.durga;

public class CasesInterface {
	public static void main(String[] args) {
		InterfP p = new InterfP() {
			public void m1() {
				System.out.println("Called from convetional interface calling.");
			}
		};
		
		// Lambda expression invoking.
		InterfP p1 = () -> System.out.println("Calling from lambda expression");
		p.m1();
		p1.m1();
		
		C c = () -> System.out.println("Calling from extended lambda expression.");
		c.m1();
	}
}

@FunctionalInterface
interface InterfP {
	public void m1();
}

@FunctionalInterface
interface C extends InterfP {
	public void m1();
}
