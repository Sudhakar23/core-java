package com.core.java.company.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractingKeyValueFromURLManually {

	
	Map<String, List<String>> mapStr= new HashMap();	
	
	public static void main(String[] args) {

		String s1 = "https://www.google.com/test?it=mayank&hr=pragya";
		String s2 = "https://www.google.com/test?it=bhaskar&hr=reeti";
		String s3 = "https://www.google.com/test?tester=mayank&finance=pragya&qa=manoj";
		String s4 = "https://www.google.com/test?hr=mayank&finance=pragya";
		
//		{pragya=hr,finance, reeti=hr, bhaskar=it, mayank=it,tester,hr, manoj=qa}
		Test2.getInfo(s4);
	}
	
	public static String getInfo(String str) {
		
		String[] strArr = str.split("?");
		String[] strParam = strArr[1].split("&");
		
		for(String nameDep : strParam) {
			String[] name = nameDep.split("=");
			
			if(mapStr.containsKey(name[1])) {
				
			}else {
				mapStr.put(name[1], null)
			}
			
			
			
		}
		
		return "";
	}

}
