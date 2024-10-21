package com.java.jlc.interfc;
interface I1{
	int a = 10;
	public static final int b = 20;
	void m1();
	public abstract void m3();
}
interface I2{
	void m11();
	public void m22();
}

abstract class Hello implements I1, I2{
	int a = 111, b = 222;
	public void m1(){
		System.out.println("M2 in Hello");
	}
	public void m2(){
		System.out.println("m3 in Hello");
	}
	void show(){
		int a = 11, b = 22;
		System.out.println("Show in Hello");
		System.out.println(a +" " +b);
		System.out.println(this.a + " " + this.b);
		System.out.println(I1.a + " " + I1.b);
	}
}

/*class Hai extends Hello{
	public void m11(){
		System.out.println("M11 in Hai");
	}
	public void m22(){
		System.out.println("M11 in Hai");
	}
}*/

public class Test65 {
	public static void main(String[] args) {
		
	}
}
