package com.java.jlc.method;

class Hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
	void m1(String ...a){
		//System.out.println(a.length);
	}
}
public class VarArgTest {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.m1("khk","asd","asf");
	}
}	
