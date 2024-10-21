package com.java.collection.map.programs;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
public static void main(String[] args) {
	 
	String r="jlc is jlc good is java learing jlc java";
	String []arr=r.split(" ");
	//System.out.println(arr);
	Map<String , Integer> m=new HashMap();
	for(String word: arr){
		Integer count=m.get(word);
		if(count==null){
			count=0;
		}
		m.put(word, ++count);
	}
	System.out.println(m);
}	
}
