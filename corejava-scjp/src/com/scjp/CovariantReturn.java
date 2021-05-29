package com.scjp;

interface I{}
class A {
	protected char ch ;

}
class B extends A{
	void m1(){
		System.out.println(ch);
	}
}
public class CovariantReturn {
	public static void main(String[] args) {
		A a = new B();
//		a.m1();
	}
}