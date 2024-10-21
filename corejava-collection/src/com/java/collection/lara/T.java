package com.java.collection.lara;

import java.util.Arrays;

public class T {
public static void main(String[] args) {
	/*int[]x={10,2,30,15,13,20};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));*/
	/*String[]x={"xyz","test","hello","abc","done"};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));*/
	/*String[]x={"abc","xyz","9999","ABC","Abc","9899","ABc"};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));*/
	int[]x={10,20,30,40,4,25};
	//int i=Arrays.binarySearch(x, 40);
	//System.out.println(i);
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
	int i=Arrays.binarySearch(x, 4);
	System.out.println(i);
	i=Arrays.binarySearch(x, 5);
	System.out.println(i);
	/*i=Arrays.binarySearch(x, 11);
	System.out.println(i);*/
	i=Arrays.binarySearch(x, 24);
	System.out.println(i);
}
}
