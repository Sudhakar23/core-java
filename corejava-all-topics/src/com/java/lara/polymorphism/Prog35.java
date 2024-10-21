package com.java.lara.polymorphism;

public class Prog35 {
	static void test(int i){System.out.println("int");}
	/*static void test(Integer obj){
		System.out.println("Integer");
	}*/
	static void test(Byte obj){
		System.out.println("Integer");
	}
public static void main(String[] args) {
	/*int i=20;
	Integer obj=new Integer(20);*/
	byte obj=10;
	//test(i);
	test(obj);
}
}
