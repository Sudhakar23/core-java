package com.java.generic;

public class EllipsisTest {

	public static void main(String[] args) {
		callEllipsisArray(2);
		callEllipsisArray(2, "ds", 4, 5, 6, 3, 4);
		callEllipsisArray(2);
	}
	public static void callEllipsisArray(Object ...arr) {
		for (Object i : arr) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
