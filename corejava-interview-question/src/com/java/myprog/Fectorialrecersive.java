package com.java.myprog;

public class Fectorialrecersive {
	static int s;

	public static void main(String[] args) {
		int i = 0;
		int a = m1(i);
		System.out.println(a);
	}

	static int m1(int j) {
		if (j > 1) {

			return j * m1(j - 1);
		}
//	System.out.println(s);
		return 1;
	}
}
