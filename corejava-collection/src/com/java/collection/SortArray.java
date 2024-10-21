package com.java.collection;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		Integer arr[] = {1,1,2,3,2,4,4,4,5,4,4,5,5,6};
		List<Integer> lt = Arrays.asList(arr);
		Iterator it = lt.iterator();
		Set<Integer> setArr = new HashSet(lt);
		Map<Integer, Integer> map = new HashMap();
		System.out.println(lt);
		for (Integer no : setArr) {
			Integer count = map.get(no);
			
			if(count == null)
				count = 0;
//			Integer value = map.get(no);
			map.put(no, ++count);
//			System.out.println(no + ":"+Collections.frequency(lt, no));
		}
		System.out.println(map);
		
	}

}
