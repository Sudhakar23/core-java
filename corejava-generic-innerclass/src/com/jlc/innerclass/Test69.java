package com.jlc.innerclass;
class Outer2{ // Non Static Inner Class
	int a = 10;
	private int b = 20;
	class Inner1{
		int a11= 101;
		private int b11 = 202;
		void m1(){
			System.out.println("\t--M1 in Inner--");
			System.out.println("\tOuter" +a +" " +"Inner pvt" +b );
			System.out.println("\tInner lcl" +a11 + " " +"Inner Pvt" +b11);
		}
	} // Inner
	void show(){
		System.out.println("**Show in Outer**");
		Inner1 inr = new Inner1();
		System.out.println(inr.a11);
		System.out.println(inr.b11);
	}
}

public class Test69{
	public static void main(String arg[]){
		Outer2 otr = new Outer2();
		otr.show();
		System.out.println(otr.a);
		Outer2.Inner1 oi1 = otr.new Inner1();
		System.out.println(oi1.a11);
		//System.out.println(oi1.b11);
	}
}

