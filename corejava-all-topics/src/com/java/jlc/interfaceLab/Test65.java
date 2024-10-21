package com.java.jlc.interfaceLab;

interface I11 {
	int a = 10;
	public static final int b = 20;

	void m1();

	public abstract void m2();

}

interface I22 {
	void m11();

	public void m22();
}

abstract class Hello65 implements I11, I22{
	int a = 111, b = 222;

	public void m1() {
		System.out.println("M1 in Hello");
	}

	public void m2() {
		System.out.println("M2 in Hello");
	}

	void show() {
		int a = 11, b = 22;
		System.out.println("Show in Hello");
		System.out.println(a + "  " + b);
		System.out.println(this.a + " " + this.b);
		System.out.println(I11.a + " " + I11.b);
	}
	// void m3(){}
}

class Hai extends Hello65 {
	public void m11() {
		System.out.println("M11 in Hai");
	}

	public void m22() {
		System.out.println("M22 in Hai");
		System.out.println(a + "  " + b);
		System.out.println(super.a + " " + super.b);
	}
}

public class Test65 {
	public static void main(String args[]) {
		/*
		 * I1 i1 = null; i1 = new Hai();
		 */
		Hai i1 = new Hai();
		i1.m1();
		i1.m2();
		/*
		 * i1.m11(); Hai i2 = new Hai(); //I2 i2 = new Hai(); i2.m11();
		 * i2.m22(); i2.m1(); i2.show(); Hai hai = new Hai(); hai.show();
		 */
	}
}