package com.java.collection.lara;

public class O {
	public static void main(String[] args) {
//		int[] x = { 10, 20, 30, 40 };
		int[] x ;
		/*
		 * for(int i=0; i<x.length;i++){ System.out.println(x[i]); }
		 */
		/*
		 * int[]x=new int[]{10,2,5,80}; for(int i:x){ System.out.println(i); }
		 */
		new O();
		test(new int[2]);
		// {10,20,30,40};
	}

	static void test(int[] x) {
		System.out.println(x.length);
		for (int i : x) {
			System.out.println(i);
		}
	}
}
