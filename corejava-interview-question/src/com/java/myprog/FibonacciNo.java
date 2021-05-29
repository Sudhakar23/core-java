package com.java.myprog;

public class FibonacciNo {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=a+b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	for (int i = 0; i < 10; i++) {
		
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
	}
	
}
}
