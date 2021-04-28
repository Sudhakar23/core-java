package com.lara.thread.exercise2;

class A {
	int i, j;

	A(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "i= " + i + " & j= " + j;
	}
}

public class Manager1 {
	public static void main(String[] args) {
		A a1 = new A(10, 20);
		System.out.println(a1);
		A a2 = new A(20, 30);
		// a1.i=20
		// String s1=a1.toString();
		// System.out.println(s1);
		// System.out.println(s1);
		System.out.println(a2);
	}
}
