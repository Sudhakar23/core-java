package com.java.collection.manish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab3 {
public static void main(String[] args) {
	Collection col=new ArrayList();
	Collection col1=new ArrayList();
	Collection col2=new ArrayList();
	col1.add("suresh");
	col2.add("uday");
	System.out.println(col1);
//	System.out.println("size:"+ col.isEmpty());
//	System.out.println("size of col1:"+ col1.isEmpty());
//	System.out.println("size of col2:"+ col1.isEmpty());
	col.add("sri");col.add("nivash");col.add("amit");col.add("kumar");col.add("manish");col.add("kumar");
	col2.addAll(col);
	System.out.println(col);
	System.out.println(col2);
	//System.out.println(col);
	//System.out.println("size:"+col.isEmpty());
	//System.out.println("Empty:"+col.isEmpty());
	
	System.out.println("after removeing kumar");
	//col.remove("kumar");
	System.out.println("size:"+col.size() );
	//System.out.println("contains(sri):"+col.contains("sri"));
	//System.out.println("contains(Rahul):"+col.contains("Rahul"));
	System.out.println("\nAllElements");
	Object datas[]=col.toArray();
	
	for(int i=0; i<datas.length; i++){
		System.out.println(datas[i]);
	}

	List l=Arrays.asList(datas);
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
}
}
