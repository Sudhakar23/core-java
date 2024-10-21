package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class othello implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}
public class Selftest16 {
public static void main(String[] args) {
	String[] s={"map", "pen", "marble", "key"};
	othello o=new othello();
	Arrays.sort(s, o);
	//System.out.println(o);
	for (String s2 : s) {
		System.out.println(s2+" ");
		System.out.println(Arrays.binarySearch(s,"pen"));
		//System.out.println(s);
	}
}
}
