package com.java.core;

class Parent{
	int a ;
	int b;
	Parent(){System.out.println("Default const");}
	Parent(int a){System.out.println("Parameterized const");}
	public void m1(int x, int y){
		this.a = x;
		this.b = y;
	}
}
class child extends Parent{
	int a ;
	int b;
	public void m1(int x, int y){
		super.a = x;
		super.b = y;
	}
	public void m2(int x, int y){
		this.a = x;
		this.b = y;
	}
}
public class ThisTest {
	int a ;
	int b;
	public static void main(String[] args) {
		Parent t = new Parent();
		t.m1(11, 12);
	}
	
}