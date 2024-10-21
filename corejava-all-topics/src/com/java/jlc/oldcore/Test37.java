package com.java.jlc.oldcore;
class Arith{
	void sum(){
	  System.out.println("Sum()");
	}
	void sum(int a){
	  System.out.println("sum(int a)");
	}
	void sum(int a, int b){
	  System.out.println("sum(int a, int b)");
	}
	int sum(double d, int a){
	  System.out.println("sum(double d, int a)");
	  return 12;
	} 
	byte sum(byte b1){
	  System.out.println("sum(byte b1)");
	  return (byte)(10+34);
	}
	void sum(double d){
	  System.out.println("sum(double d)");
	}
	void sum(float f){
	  System.out.println("sum(float f)");
	}	
}
class Test37{
  public static void main(String args[]){
	Arith ar = new Arith();
	ar.sum();
	ar.sum(111);
	ar.sum((byte)111);
	ar.sum(11.11f);
	ar.sum(11.0,20);
	ar.sum(20,34);
  
  }
}