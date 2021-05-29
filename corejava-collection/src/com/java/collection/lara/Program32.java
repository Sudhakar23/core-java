package com.java.collection.lara;

import java.util.Arrays;

class D1 implements Comparable{
	int i;
	D1(int i){
		this.i=i;
	}
	public String toString(){
		return "i=" +i;
	}
	@Override
	public int compareTo(Object o) {
    //D1 d1=(D1)o;
//return i-d1.i;
		return i-((D1)o).i;
	}
}
public class Program32 {
public static void main(String[] args) {
	D1[]x={
			new D1(9),
			new D1(90),
			new D1(19),
			new D1(8),
			new D1(98),
			new D1(7),
			new D1(99),
			new D1(55),
	};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
}
}
