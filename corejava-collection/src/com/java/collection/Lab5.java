package com.java.collection;

import java.util.*;

public class Lab5 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("sid", 101); 
		hm.put("sname", "sudha");
		hm.put("email", "abc@gmail");
		hm.put(null, 202);
//		System.out.println(hm);
//		System.out.println(hm.size());
//		System.out.prin tln(hm.containsKey("sid"));
//		System.out.println(hm.containsValue(101));
		System.out.println(hm);
		System.out.println("====================");
//		Collection col = hm.values();
		Collection col = hm.values();
		System.out.println(col);
		Set s = hm.keySet();
		System.out.println(s);
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
