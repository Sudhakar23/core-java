package com.java.myprog;

public class Argument {
public static void main(String[] args) {
	int sum=0;
	double aver=0;
	int n=Integer.parseInt(args[0]);
	System.out.println(n);
	/*int a=Integer.parseInt(args[0 ]);
	int b=Integer.parseInt(args[1 ]);*/
	for (int i = 0; i <n; i++) {
		System.out.println(i);
		
		 sum+=i;
		 aver=sum/n;
	}
	System.out.println(sum);
	System.out.println(aver);
	
}
}
