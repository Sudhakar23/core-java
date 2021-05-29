package com.java.polymorphism;
class A{
	int i;
	String s1;
	//int j;
	/*A(int i,int j){
		this.i=i;
		this.j=j;
		
	}*/
	//using String and int.
	A(String s1, int i){
		this.s1=s1;
		this.i=i;
	}
	public String toString(){
	return "i= "+i+" String= " +s1;	
	}
}
public class Prog1 {
public static void main(String[] args) {
	A a1=new A("rupsi",20);
	A a12=new A("kumari",23);
	System.out.println(a12);
	//prog4.
	A a3= a12;
	A a4= a1;
	System.out.println("a3= "+a3);
	System.out.println("a4= "+a4);
	//a1.i=20;
	//System.out.println(a1.i);
	System.out.println(a1);
	//String s1=a1.toString();
	//System.out.println(s1);
	//System.out.println(a1.toString());
}
}
