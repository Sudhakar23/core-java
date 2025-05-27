package com.java.collection;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put("sid", 101); 
		hashMap.put("sname", "sudha");
		hashMap.put("email", "abc@gmail");
		hashMap.put(null, 202);
		
		System.out.println(hashMap);
		System.out.println("====================");
		Collection col = hashMap.values();
		System.out.println("hashMap values : "+col);
		Set set = hashMap.keySet();
		System.out.println(set);
		Iterator it = col.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
/*		Iterator it = s.iterator();
		while(it.hasNext()){
			Object ol = it.next();
			String key="";
			if(ol != null){
				key=ol.toString();
			}else{
				key=null;
			}
			
			Object o2 = hm.get(key);
			String val = "";
			if(o2!=null){
				val = o2.toString();
			}else{
				val = null;
			}
			System.out.println(key +" : " +val);
		}*/
	}
}
