package com.java.scjpdump;

public class Number1 {
	
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=a+b;
	for (int i = 0; i < 13; i++) {
		System.out.println(a);
		a=b;
		b=c;
		c=a+b;
	}
}
}
