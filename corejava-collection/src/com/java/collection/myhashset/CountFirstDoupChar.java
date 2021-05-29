package com.java.collection.myhashset;

import java.util.HashMap;
import java.util.Map;

public class CountFirstDoupChar {
	public static void main(String[] args){
		boolean b[] = new boolean[122];
		String str = "We are programmers and we are using java as programming tool.";
		String s1[]=str.split(" ");
//		char ch = str.charAt(1);
//		System.out.println(ch);
		
//		System.out.println(b[str.charAt(1)]);
//		for (boolean c : b) {
//			System.out.println(c);
//		}
		
		
//		 System.out.println(retunFirstDoup(str));
		//System.out.println(retunFirstDoupNoHashMap(str));
		System.out.println(retunFirstDoupWoord(s1));
		 
	}
	public static String retunFirstDoupWoord(String []s){
		Map<String, Integer> map=new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			if (map.get(s[i])!=null) {
				return String.valueOf(s[i]);
			}else
				map.put(s[i], 1);
		}
		return null;
	}

	public static String retunFirstDoup(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) != null) {
				return String.valueOf(str.charAt(i));
			} else
				map.put(str.charAt(i), 1);
		}
		return null;
	}

	public static String retunFirstDoupNoHashMap(String str) {
		boolean b[] = new boolean[119];
		for (int i = 0; i < str.length(); i++) {
			 System.out.println(str.charAt(i) +" "+ ((int)str.charAt(i)));
			if (b[str.charAt(i)]) {
				return String.valueOf(str.charAt(i));
			} else{
				b[str.charAt(i)] = true;
//				System.out.print(str.charAt(i));
			}
		}
		return null;
	}
}