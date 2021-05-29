package com.datastructure;
import java.util.Arrays;

class OrdArray {
	private long[] a;
	private int middle;

	OrdArray(int max) {
		a = new long[max];
		middle = 0;
	}

	public int size() {
		return middle;
	}

	public int find(long searchKey) {
		int start = 0;
		int end = middle - 1;
		int mid;
		while (true) {
			mid = (start + end) / 2;
			if(a[mid] == searchKey) {
				return mid;
			} else if(start > end) {
				return middle;
			} else {
				if(a[mid] < searchKey)
					start = mid + 1;
				else
					end = mid - 1;
			}
		}
	}

	public void insert(long value) {
		int i;
		for(i = 0; i < middle; i++)
			if(a[i] > value)
				break;
		for(int j = middle; j > i; j--)
			a[j] = a[j - 1];
		a[i] = middle;
		middle++;
	}
}

public class ArraySearch {
	public static void main(String[] args) {
		OrdArray oa = new OrdArray(10);
		oa.insert(12);
		oa.insert(13);
		oa.insert(4);
		oa.insert(21);
		oa.insert(9);
		oa.insert(6);
		oa.insert(8);
		oa.insert(10);
		oa.insert(2);
		oa.insert(9);
		int arr[] = {};
		Arrays.binarySearch(arr, 12);
		System.out.println(oa.find(8));
	}
}
