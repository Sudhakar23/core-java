package com.java.jlc.t53;
class Animal{
	int a, b,a11=100;
	static int c = 30;
	{
		int a11 = 11;
		System.out.println("Instance Block in Animal");
		System.out.println("Instance Block in Animal :" +a11);
		this.a11 = 2000;
		System.out.println("IB in Aminal -this-:" +this.a11);
	}
	
	static{
		System.out.println("Static Block in Animal");
	}
	
	public Animal(){
		System.out.println("Default const in Animal");
	}
	Animal(int a){
		this.a = a ;
		System.out.println("One para const in Animal");
	}
	Animal(int a, int b){
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

class Dog extends Animal{
	int a11, b11;
	static int c11=60;
	
	{
		System.out.println("Instance Block in DOG");
	}
	
	static{
		System.out.println("Static Block in DOG");
	}
	
	Dog(){
		super();
		System.out.println("Default cost in DOG");
	}
	Dog(int a11){
		super(1000);
		System.out.println("One para const in Dog");
		this.a11 = a11;
	}
	Dog(int a11, int b11){
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
	//	Animal ani = new Animal();
		Dog dog = new Dog();
		//System.out.println("");
		//Dog dog1 = new Dog();System.out.println("");			
		//dog1.show();
		
		//dog1.show2();
	}
}