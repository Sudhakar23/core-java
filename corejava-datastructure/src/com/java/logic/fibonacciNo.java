package com.java.logic;

public class fibonacciNo {
public static void main(String[] args) {
	int a=0,b=1,c=a+b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	for (int i = 0; i < 5; i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
	}
}
}
