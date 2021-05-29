package com.java.tst;

import java.util.*;

class ABC {

}

public class TTTTTT extends HashMap{
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(2, "anand");
		map.put(3, "ashu");
		map.put(4, "ashu");
		map.put(5, "sudhakar");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(),
                                                           entry.getValue());
        }
		//Map.Entry<Integer, String> entry = map.entrySet();
		Set t = map.entrySet();
//		Map.Entry<Integer,String> t= map.entrySet();
		//System.out.println(t.getKey());
		//System.out.println(t.getValue());
	}
}