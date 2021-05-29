package com.java.jlc.innerclass;

//import com.jlc.innerclasstest.Outer;

class Outer{ // Non Static Inner Class
	int a = 10;
	static int b = 20;
	{
		System.out.println("IB in Outer");
	}
	static{
		System.out.println("SB in Outer");
	}
	void m1(){
		System.out.println("M1 in Outer");
	}
	static void m2(){
		System.out.println("M2 staic in Outer");
	}
	class Inner{
		int a1 = 10;
		//static int b1 = 20;
		int b;
		 int b11 = 30;
		{
			System.out.println("IB in inner");
		}
		/*static{System.out.println("SB not allowed");	}*/
		void m11(){
			System.out.println("M11 in Inner");
		}
		/*static void m2(){	}*/
		void show(){
			System.out.println("Show in Inner");
			System.out.println(a +"  " +b);
			System.out.println(Outer.b);
			m1();m2();m11();
			System.out.println("End of show");
		}
	} // Inner
	void show1(){
		System.out.println("**Show in Outer**");
		Inner inr = new Inner();
		System.out.println(inr.a1);
		System.out.println(inr.b11);
		inr.show();
	}
}
public class Test67{
	public static void main(String arg[]){
		Outer otr = new Outer();
		//otr.show1();		otr.show();
		//Outer.Inner oi1 = new Outer.new Inner();
		//Outer.Inner oi2 = new Outer().new Inner();
		System.out.println("***In Main***");
		Outer.Inner oi3 = new Outer().new Inner();
		Outer.Inner oi4 = otr.new Inner();
		//oi3.show();
		//oi4.show();
		//oi4.show1();
		
	}
}