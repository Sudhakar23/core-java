package com.java.collection;

import java.util.Arrays;

public class Lab9 {
	public static void main(String[] args) {
		int arr[] = {10,23,44,56,776,43};
		int arr1[] = {10,23,44,56,776,43};
//		int arr2[] = {10,23,85,45,12,78,896};

//		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.binarySearch(arr, 2));
		System.out.println(Arrays.equals(arr, arr1));
	}
}
