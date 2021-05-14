package com.java.generic;

import java.util.Arrays;

class ArrayInit{
	int a[] ;
	
	ArrayInit(int a[]){
		this.a = a; 
	}
	
	void printArray() {
		System.out.println(Arrays.toString(a));
	}
	
	void reverseArray() {
		int j = a.length;
		int temp[] = new int[j];
		for (int i = 0 ; i < a.length; i++) {
			temp[--j] = a[i];
		}
		System.out.println("Reverse array " +Arrays.toString(temp));
	}
	
}
public class GenericArrayInit {
	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44}; 
		ArrayInit arryInit = new ArrayInit(arr);
		arryInit.printArray();
		arryInit.reverseArray();
		arryInit.printArray();
		
	}
}
