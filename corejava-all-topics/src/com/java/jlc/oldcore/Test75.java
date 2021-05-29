package com.java.jlc.oldcore;

class Hello{
	void m1(){
		System.out.println("M1 in Hello...");
	}
}
class Test75{
	public static void main(String args[]){
		Hello h1 = new Hello();
		h1.m1();
	}
}