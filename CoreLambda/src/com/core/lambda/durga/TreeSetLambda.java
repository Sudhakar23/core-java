package com.core.lambda.durga;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetLambda {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((I1, I2)-> {return (I1>I2)?-1:(I1<I2)?1:0;});
//		TreeSet ti = new TreeSet(new Comparator() {
//
//			public int compare(Object o1, Object o2) {
//				// TODO Auto-generated method stub
//				return 1;
//			}
//			
//		});
		
		t.add(13);
		t.add(3);
		t.add(32);
		t.add(35);
		t.add(33);
		t.add(23);
		System.out.println(t);
	}
}
