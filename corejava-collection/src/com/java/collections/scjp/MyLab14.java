package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyLab14 {
	    public static void main(String[] args) {
	    	MyLab14 test = new MyLab14();
	        List<String> someList = new ArrayList<String>(); 
	        someList.add("d,e,3");
	        someList.add("a,b,12");
	        someList.add("c,d,3");
	        someList.add("b,a,12");
	        someList.add("a,b,12");
	            //using a TreeMap since you care about the order
	        Map<String,String> dupMap = new TreeMap<String,String>();
	        String key = null;
	        for(String some:someList){
	            key = test.sort(some);
	            if(key!=null && key.trim().length()>0 && !dupMap.containsKey(key)){
	                dupMap.put(key, some);
	            }
	        }
	        List<String> uniqueList = new ArrayList<String>(dupMap.values());
	        for(String unique:uniqueList){
	            System.out.println(unique);
	        }

	    }
	    private String sort(String key) {
	      if(key!=null && key.trim().length()>0){
	        char[] keys = key.toCharArray();
	        Arrays.sort(keys);
	        return String.valueOf(keys);
	      }
	      return null;
	   }
	}

