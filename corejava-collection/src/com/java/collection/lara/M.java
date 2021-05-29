package com.java.collection.lara;

public class M {
public static void main(String[] args) {
//	int[]x=new int[2];
//	int[]y=x;
//	Object obj=y;
//	int[] z=(int[])obj;
//	System.out.println("done");
	/*int[]x={1,2,3,4,5};
	int[]y=x;
	System.out.println(y[2]);*/
	Object obj=new int[]{1,2,3};
	int[]someArray=(int[])obj;
	for(int i:someArray){
		System.out.println(i+"--");
	}
}
}
