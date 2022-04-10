package com.core.polymorphism;

class GrandParent{
	{ //Instance Block
		System.out.println("GrandParent instance block");
	}
	
	static { // Static Block
		System.out.println("GrandParent static block");
	}
	GrandParent(){
		System.out.println("GrandParent constructor block");
	}
}
class Parent extends GrandParent {
	{ //Instance Block
		System.out.println("Parent instance block");
	}
	
	static { // Static Block
		System.out.println("Parent static block");
	}
	Parent(){
		System.out.println("Parent constructor block");
	}
	public  void p1() {
		System.out.println("p1 from Patent");
	}
}
class Child extends Parent{
	{ //Instance Block
		System.out.println("Child instance block");
	}
	
	static { // Static Block
		System.out.println("Child static block");
	}
	Child(){
		System.out.println("Child constructor");
	}
	public  void p1() {
		System.out.println("p1 from Child");
	}
}

public class RuntimePolymorphismTest {
	public static void main(String[] args) {
		Parent p = new Child();
//		p.p1();
	}
}
