package com.java.myprog;

public class Number {
	static int n;
public static void main(String[] args) {
	int sum=0;
	int aver=0;
	for (int i = 0; i < n; i++) {
		System.out.println(i);
		
		 sum+=i;
		 aver=sum/n;
	}
	System.out.println(sum);
	System.out.println(aver);
}
}
