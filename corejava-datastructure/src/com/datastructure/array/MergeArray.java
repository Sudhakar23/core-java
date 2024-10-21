package com.datastructure.array;

import java.util.Arrays;
import java.util.Iterator;

public class MergeArray {

	public static void main(String[] args) {
//		Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
		int arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}; 
		int arr3[] = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr3.length; ) {
		   for(int j = 0; j<arr1.length; j++) {
			   arr3[i] = arr1[j];
			   i++;
		   }
		   for(int j = 0; j<arr2.length; j++) {
			   arr3[i] = arr2[j];
			   i++;
		   }
		   
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		Arrays.sort(arr3);
		
//		System.out.println(arr3.toString());
		Test t = new Test();
		
	}
}
class Test{
	public Test(){
		System.out.println("const");
	}
}