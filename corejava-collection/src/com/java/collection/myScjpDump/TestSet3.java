package com.java.collection.myScjpDump;

import java.util.Arrays;

public class TestSet3 {
	public static void main(String[] args) {
		Object[] myObjects = { 
//				new Integer(12), 
				new String("foo"), 
//				new Integer(5), 
				new String("too"), 
//				new Boolean(true) 
				};
		Arrays.sort(myObjects);
		for (int i = 0; i < myObjects.length; i++) {
			System.out.print(myObjects[i].toString());
			System.out.print(" ");
		}
	}
}
