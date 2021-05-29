package com.java.collection.myScjpDump;

import java.util.List;

public class TestSet16 {
	
	public static int sum(List<Integer> intList) {
		 int sum = 0;
		 for ( int i :intList ) {
		 
		 sum += i;
		 }
		 return sum;
		 }
	public static void main(String[] args) {
		TestSet16 t16=new TestSet16();
		System.out.println(t16);
		
	}
}
