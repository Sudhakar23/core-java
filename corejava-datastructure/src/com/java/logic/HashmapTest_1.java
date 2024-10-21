package com.java.logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapTest_1 {

	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put("anand",1);
		hs.put("annada",3);
		Integer c=10;
		Integer c1=10;
		String s11=c1.toString();
		System.out.println(s11);

		Set s=hs.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
		Object obj= it.next();
		Map.Entry me=(Map.Entry)obj;
		System.out.println(me.getKey()+"\t"+me.getValue());
		if(me.getKey().toString().length()==6){
		 System.out.println(me.getKey());	
		}
		}
	}
}
