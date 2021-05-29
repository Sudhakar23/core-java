package com.java.exception;

public class T {
	public static void main(String[] args) {
		int a = 5;
		m1(a);
	}
	static void m1(int a){
		System.out.println("*");
		if(a>0){
			m1(a-1);
		}else {
			System.exit(0);
		}
	}
	
}
