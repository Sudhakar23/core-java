package com.java.collection.lara;

import java.util.Arrays;
class A1{
	int i;
	A1(int i){
		this.i=i;
	}
}
public class Quest {
public static void main(String[] args) {
	/*String[]colors={"blue","red","green","yellow","orange"};
	Arrays.sort(colors);
	System.out.println(Arrays.toString(colors));
	int i1=Arrays.binarySearch(colors, "orange");
	int i2=Arrays.binarySearch(colors, "white");
	System.out.println(i1+"colors "+i2);*/
	A1[] x=new A1[2];
	x[0]=new A1(90);
	x[1]=new A1(80);
	for(int j=0; j<x.length; j++){
		System.out.println(x[j].i);
	}
	//System.out.println(x[0].i);
	//System.out.println(Arrays.toString(x));
}
}
