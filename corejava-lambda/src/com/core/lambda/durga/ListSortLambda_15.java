package com.core.lambda.durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortLambda_15 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(13);
		list.add(5);
		list.add(2);
		list.add(10);
		System.out.println(list);
		
//		Collections.sort(list); // Ascending order 

		//Using without Lambda expression
//		Collections.sort(list, new MyComparator());
		
		//Using Lambda expression
		Collections.sort(list, (ob1, ob2) ->  {return (ob1 > ob2) ? -1 : (ob1 < ob2) ? 1 : 0;}); // Descending order
		System.out.println(list);
	}	
}

//Class used for implementing compare method, used for without  Lambda expression 
class MyComparator implements Comparator<Integer>{
	public int compare(Integer obj1, Integer obj2) {
		return  (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0;
		//-1 obj1 has to come before obj2
		// 1 obj1 has to come after  obj2
	}
}