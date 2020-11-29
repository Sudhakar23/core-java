package com.core.lambda.durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortLambda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(13);
		list.add(5);
		list.add(2);
		list.add(10);
		System.out.println(list);
		Collections.sort(list, ( i1, i2)->{return (i1>i2) ? -1 : (i1<i2) ? 1 : 0;});
		System.out.println(list);
		
	}
	
}
class MyComparator implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
		return  (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
	}
	
}