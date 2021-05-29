package com.java.collection.lara;

import java.util.Arrays;

class E1 implements Comparable{
	int i,j;
	E1(int i,int j){
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		
		return "(" +i+"," +j+")";
	}
	@Override
	public int compareTo(Object o) {

    E1 e1=(E1)o;
		return e1.j-j;
	}
}
public class Program34 {
public static void main(String[] args) {
	E1[]x={
			new E1(1,2),
			new E1(2,0),
			new E1(0,1),
			new E1(5,9),
			new E1(3,4),
	};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
}
}
