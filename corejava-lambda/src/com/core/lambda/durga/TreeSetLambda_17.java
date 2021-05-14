package com.core.lambda.durga;

import java.util.Comparator;
import java.util.TreeSet;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Comparison;

public class TreeSetLambda_17 {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((I1, I2)-> {return (I1 > I2)?-1:(I1 < I2)?1:0;});
//		TreeSet<Integer> t = new TreeSet<Integer>((I1, I2)-> {return I1.compareTo(I2);});
//		TreeSet<Integer> t = new TreeSet<>();
//		TreeSet<Integer> t = new TreeSet(new MyComparatorTS());
		
		t.add(13);
		t.add(3);
		t.add(32);
		t.add(35);
		t.add(33);
		t.add(0);
		t.add(23);
		System.out.println(t);
	}
}

class MyComparatorTS implements Comparator<Integer>{
	public int compare(Integer obj1, Integer obj2) {
		return obj1 > obj2 ? -1 : obj1 < obj2 ? 1 : 0;
		//-1 obj1 has to come before obj2
		// 1 obj1 has to come after  obj2
	}
}