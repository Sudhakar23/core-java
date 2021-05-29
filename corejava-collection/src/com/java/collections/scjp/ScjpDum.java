package com.java.collections.scjp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ScjpDum {
	public static void main(String[] args) {
		
	
	HashMap props = new HashMap();
	 props.put("key45", "some value");
	 props.put("key12", "some other value");
	 props.put("key39", "yet another value");
	Set s = props.keySet();
	 System.out.println(s);
	 //Arrays.sort(s);
	// Collections.sort(s);
	s=new TreeSet(s);
	// s=new  SortedSet(s);
	 System.out.println(props);
}
}