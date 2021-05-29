package com.java.jlc.interfaceLab;
interface I1{
	int a = 10;
	void m1();
}
interface I2{
	public static final int b = 20;
	public abstract void m2();
}
interface I3 extends I1, I2{
	int x = 99;
	void m3();	
}
interface I4{
	int c = 33;
	void m4();
}
interface I5{
	int d = 44;
	void m5();
}
interface I6 extends I4, I5{
	int x = 88;
	void m3();
}

class Hello66 implements I3, I6{
	public void m1(){
		System.out.println("M1 in Hello");
	}
	public void m2(){
		System.out.println("M2 in Hello");
	}
	public void m3(){
		System.out.println("M3 in Hello");
	}
	public void m4(){
		System.out.println("M4 in Hello");
	}
	public void m5(){
		System.out.println("M5 in Hello");
	}	
	void show(){
		System.out.println("Show in Hello");
		System.out.println(a +" " +b +" " +c);
		//System.out.println(x);
		System.out.println("I3.x" +I3.x +"I6.x" +I6.x);
	}
}
public class Test66{
	public static void main(String args[]){
		I3 i3 = new Hello66();
		i3.m1();
		i3.m2();
		i3.m3();
		//i3.m4();
		I6 i6 = new Hello66();
		i6.m4();
		i6.m3();
		//i6.m1();
		Hello66 h = new Hello66();
		h.show();	
	}
}