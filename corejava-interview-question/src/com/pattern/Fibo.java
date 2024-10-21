package com.pattern;

public class Fibo {
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		int a = 0, b = 1, sum = 0;
		System.out.println(a);
		// System.out.println(b);
		fibonacci(5);
		// while(sum < 100){
		// a = b ;
		// b = sum;
		// sum = a+b;
		// System.out.println(sum);
		//
		// }
	}

	public static void fibonacci(int number) {
		if(number>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fibonacci(number-1);    
	     }    
	}
}
