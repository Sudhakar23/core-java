package com.scjpdumps;
class Alfa{
	public void foo(String... arg){
		System.out.println("Alfa:foo");
	}
	public void bar(String a){
		System.out.println("Alfa: bar");
	}
}
public class Beta extends Alfa{
	public void foo(String a ){
		System.out.println("Beta: foo");
	}
	public void bar(String a){
		System.out.println("Beta:bar");
	}
public static void main(String[] args) {
	Alfa a=new Beta();
	Beta b=(Beta)a;
	a.foo("teat1");
	a.bar("test2");
	b.foo("test3");
	b.bar("test4");
	b.foo("test");
}
}
