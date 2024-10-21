package com.java.lara.polymorphism;

public class Prog45 {
	static void test(int x,String...y){
		System.out.println(x);
		System.out.println(y.length);
	}
public static void main(String[] args) {
	test(10);
	test(1,"abc");
	test(30,"xyz","hello");
	test(40,"done","cheak","hello");
}
}
