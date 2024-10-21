package com.java.collection.lara;

import java.util.Arrays;

public class Program31 {
public static void main(String[] args) {
	Object[]myObjects={
			new Integer(12),
			new String("foo"),
			new Integer(5),
			new Boolean(true)
	};
	Arrays.sort(myObjects);
	for(int i=0; i<myObjects.length; i++){
		System.out.println(myObjects[i].toString());
		System.out.println("qqqqq");
	}
}
}
