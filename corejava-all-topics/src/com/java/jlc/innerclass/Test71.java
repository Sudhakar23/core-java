package com.java.jlc.innerclass;
class Outer3{
	int a = 10;
	static int b = 20;
	void m1(){
		System.out.println("M1 in Outer");
	}
	static void m2(){
		System.out.println("M2 staic in Outer");
	}
	static class Inner3{
		int a11 = 11;
		static final int b11 = 30;
		{System.out.println("IB in Inner Class");}
		static{	System.out.println("SB in Inner Class");}
		void m11(){	System.out.println("M11 in Inner");	}
		static void m22(){System.out.println("M22 in Inner");}
		void show1(){
			System.out.println("Show1 in Inner");
			//System.out.println(a);
			System.out.println(b);
			System.out.println(a11 +" " +b11);
			//m1();
			m2();
			m11();
			m22();
		}
		static void show2(){
			System.out.println("Show in Inner");
			//System.out.println(a);
			System.out.println(b);
			//System.out.println(a11);
			System.out.println(b11);
			//m1();
			m2();
			//m11();
//			m22();
		}
	} // Inner
	void show(){
		System.out.println("Show in Outer");
		Inner3 inr = new Inner3();
		inr.show1();
		Inner3.show2();
	}
}
public class Test71{
	public static void main(String arg[]){
		Outer3 otr = new Outer3();
//		Outer3.Inner3 otr1 = new Outer3.Inner3();
		Outer3.Inner3 otr1 = new Outer3.Inner3();
		otr1.show1(); otr.show();
		//Outer.Inner oi1 = new Outer.new Inner();
		//Outer.Inner oi2 = new Outer().new Inner();
		//System.out.println("***In Main***");
		//Outer.Inner oi3 = new Outer().new Inner();
		//Outer.Inner oi4 = otr.new Inner();
		//oi3.show();
		//oi4.show();
		//oi4.show1();		
	}
}