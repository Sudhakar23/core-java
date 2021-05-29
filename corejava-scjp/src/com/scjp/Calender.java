package com.scjp;

class Calc{
	private final void m1(){System.out.println("Calender");}
	
}

public class Calender extends Calc {
	public final void m1(){System.out.println("asfasf");}
	
	public static void main(String[] args) {
		new Calender().m1();
	}
}
