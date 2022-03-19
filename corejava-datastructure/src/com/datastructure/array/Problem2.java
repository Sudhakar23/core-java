package com.datastructure.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Problem2 {

	public static void main(String[] args) {
//		input = 				aaaaaaaaabbbbtttttttddddaaaaat
//		output = 				9a4b7t4d5a1t
		
		String inputString = "aaaaaaaaabbbbtttttttddddaaaaat";
		char charArr[] = inputString.toCharArray();
		
		int counter = 0;
		int x = ' ';
		for (int i = 0; i<charArr.length; i++) {
			
			if(charArr[i] == charArr[i+1]) {
				x = charArr[i];
			}
			
		}
		
		Map<String, Integer> map = new HashMap();
//		for (String strSet : inputStr) {
//			int count = 0;
//			if(map.containsKey(strSet)) {
//				count = map.get(strSet);
//				map.put(strSet, ++count);
//			}else {
//				map.put(strSet, ++count);
//			}
//		}
		
		System.out.println(map);
		
	}

}
