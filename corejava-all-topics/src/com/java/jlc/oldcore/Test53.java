package com.java.jlc.oldcore;
class Animal53{
	int a, b,a11=100;
	static int c = 30;
	{
		int a11 = 11;
		System.out.println("Instance Block in Animal");
		System.out.println(a11);
		this.a11 = 2000;
		System.out.println("this in SB" +this.a11);
		}
	
	static{
		System.out.println("Static Block in Animal");

	}
	
	public Animal53(){
		System.out.println("Default const in Animal");
	}
	Animal53(int a){
		this.a = a ;
		System.out.println("One para const in Animal");
	}
	Animal53(int a, int b){
		this.a = a ; this.b = b;
		System.out.println("Two para const in Animal");
	}
	private void m1(){
		System.out.println("m1 in Animal");
	}
	void show(){
		System.out.println("Show in Animal");

	}
}

class Dog53 extends Animal53{
	int a11, b11;
	static int c11=60;
	
	{
		System.out.println("Instance Block in DOG");
	}
	
	static{
		System.out.println("Static Block in DOG");
	}
	
	Dog53(){
		// super();
		System.out.println("Default cost in DOG");
	}
	Dog53(int a11){
		super(1000);
		System.out.println("One para const in Dog");
		this.a11 = a11;
	}
	Dog53(int a11, int b11){
		this.a11 = a11; 
		this.b11=b11;
		System.out.println("Two para const in Dog");
	}
	void show2(){
		//System.out.println("SHow2 in DOG");
		//System.out.println(a +" " +b +"  "  + c );
		//System.out.println(a11 +" " +b11 +"  "  +c11 );
		System.out.println(super.a11 );
	}
}
class Test53{
	public static void main(String arg[]){
		Animal53 ani = new Animal53();
		Dog53 dog = new Dog53();System.out.println("");
		//Dog dog1 = new Dog();System.out.println("");			
		//dog1.show();
		
		//dog1.show2();
	}
}