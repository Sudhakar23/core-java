package com.datastructure;
public class NewLinearSearch {
	public static void main(String[] args) {
		int r[] = {2, 3, 4, 5, 6, 7};
		System.out.println(MyLinearSearch.searchingByLSearch(r, 8));
	}
}

class MyLinearSearch {
	public static int searchingByLSearch(int a[], int iteam) {
		int index = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == iteam) {
				index = i;
				break;
			}
		}
		return index;
	}
}
