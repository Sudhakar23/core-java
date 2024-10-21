package com.datastructure;

class Search{
	public static int myBinarySearch(int a[], int key){
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high)/2;
			int midVal = a[mid];
			
			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
				return -(low + 1);  // key not found.
	}
}

public class MyBinarySearch {
	public static void main(String[] args) {
	int arr[] = {1,3,5,6,8,9,12};
	System.out.println(Search.myBinarySearch(arr, 8));
		//int a = 17;
		//System.out.println(a>>2);
	}
}