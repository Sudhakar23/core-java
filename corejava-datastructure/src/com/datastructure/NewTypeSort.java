package com.datastructure;

class NewClass {
	public static int[] sortArray(int a[]) {
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = 0; j < a.length - 1; j++) {
				if(a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
}

public class NewTypeSort {
	public static void main(String[] args) {
		int arr[] = {6, 3, 8, 2, 5};
		// NewClass nc = new NewClass();
		int d[] = NewClass.sortArray(arr);
		for(int s : d) {
			System.out.print(s);
		}
	}
}
