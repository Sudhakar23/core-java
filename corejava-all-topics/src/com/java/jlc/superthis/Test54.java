package com.java.jlc.superthis;
class A5{
	int a, b;
	static int c = 30;
	{
		System.out.println("IB in A");
	}
	static{
		System.out.println("SB in A");
	}
	A5(){
		System.out.println("Default const in A");
	}
	A5(int a){
		this.a = a ;
		System.out.println("One para const in A");
	}
	A5(int a, int b){
		this.a = a ; this.b = b;
		System.out.println("Two para const in A");
	}
	void show(){
		System.out.println("Show in A");
		System.out.println(a +" " +b +"  "  + c );
	}
}
class B5 extends A5{
	int a, b;
	static int c = 30;
	{
		System.out.println("IB in B");
	}
	static{
		System.out.println("SB in B");
	}
	B5(){
		System.out.println("DefBult const in B");
	}
	B5(int b){
		super(12);
		this.a = a ;
		System.out.println("One pBrB const in B");
	}
	B5(int a, int b){
		super(12,71);
		this.b = b ; this.b = b;
		System.out.println("Two pBrB const in B");
	}
	void show(){
		int a = 111, b = 222, c = 333;
		System.out.println("Show in B");
		System.out.println(a +" " +b +"  "  + c );
		System.out.println(this.a +" " +this.b +"  "  + this.c );		
	}
}
class C5 extends B5{
	int a, b;
	static int c = 30;
	{
		System.out.println("IB in C");
	}
	static{
		System.out.println("SB in C");
	}
	C5(){
		System.out.println("DefBult const in C");
	}
	C5(int a){
		super(11);
		this.a = a ;
		System.out.println("One pBrB const in C");
	}
	C5(int a, int b){
		super(22,33);
		this.a = a ; this.a = a;
		System.out.println("Two pBrB const in C");
	}
	void show(){
		int a = 101, C = 202, c = 303;
		System.out.println("Show in C");
		System.out.println(a +" " +b +"  "  + c );
		System.out.println(this.a +" " +this.b +"  "  + this.c );		
		System.out.println(super.a +" " +super.b +"  "  + super.c );		
	}
	void showAll(){
		System.out.println("Show all in C");
		show();
		super.show();
	}
}
class Test54{
	public static void main(String arg[]){
		C5 c1 = new C5();
		C5 c2 = new C5(999);
		C5 c3 = new C5(888,777);
		c1.showAll();
	}
}