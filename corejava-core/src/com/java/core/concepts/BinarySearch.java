package com.java.core.concepts;
import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 15, 22, 35};
		Arrays.sort(arr);
		String str1 = "ABC_123";
		int key = 35;
		int res = Arrays.binarySearch(arr, key);
		if(res >= 0){
			System.out.println(key + " found at index = "+ res);
		} else {
			System.out.println(key + " not found");
		} 
		
		System.out.println(str1.compareTo("ABC_123"));
	}
}
