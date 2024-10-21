package com.java.jlc.oldcore;
class Outer1{
	static class Inner1{
		static class Inner2{
			static class Inner3{
				int a = 10;
				void m1(){
					System.out.println(a);
				}
			}
		}
	}
}
public class MultiInner{
	public static void main(String arg[]){
	Outer1.Inner1.Inner2.Inner3 otr = new Outer1.Inner1.Inner2.Inner3();
	//Outer.Inner1.Inner2.Inner3 ob = new Outer(). new Inner1(). new Inner2(). new Inner3();
	//Outer.Inner1.Inner2.Inner3 ob = new Outer().new Inner1().new Inner2().Inner3();
	//ob.m1();
	otr.m1();
	}
}