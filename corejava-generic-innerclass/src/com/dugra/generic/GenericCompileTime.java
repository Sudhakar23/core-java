package com.dugra.generic;

import java.util.ArrayList;

public class GenericCompileTime {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<String>();
		System.out.println("");
		l.add(10);
		l.add(10.5);
		l.add(true);
		System.out.println(l);
		
		ArrayList<String> aList = new ArrayList();
		aList.add("java");
		aList.add("spring");
		System.out.println(aList);
		m1(aList);
		System.out.println(aList);
		
		Long ln1[] = {3L,4L,5L};
		System.out.println(ln1[0] +" " +ln1[1] +" " +ln1[2] );

		Long ln2[] = change(ln1);
		
		System.out.println(ln1[0] +" " +ln1[1] +" " +ln1[2] );
		System.out.println(ln2[0] +" " +ln2[1] +" " +ln2[2] );
		
	}
	public static Long[] change(Long[] ln){
		
		ln[1] = ln[1] + 1;
		System.out.println(ln[0] +" " +ln[1] +" " +ln[2] +"*");
		return ln;
	}
	public static void m1(ArrayList aList){
		aList.add(10);
		aList.add(10);
	}
}
