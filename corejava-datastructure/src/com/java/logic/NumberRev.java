package com.java.logic;

import java.util.Scanner;

public class NumberRev {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a num:");
	int a=sc.nextInt(), b,d =0;
	for (int i = a; i >0; i=a) {
		b=a%10;
		a=a/10;
		d=d*10+b;
	}
	System.out.println(d);
}
}
