package com.datastructure;

public class NewSelectionShorting {
public static void main(String[] args) {
	int []ru={6,3,7,2,4,9,1};
	MySelectionShorting.MethodForSelectionShort(ru);
	for (int sh : ru) {
		System.out.print(sh);
	}
}
}
 class MySelectionShorting{
	 public static void MethodForSelectionShort(int []a){
		 int temp=0;
		 for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	 }
 }