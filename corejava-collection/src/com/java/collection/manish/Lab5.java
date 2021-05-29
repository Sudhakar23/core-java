package com.java.collection.manish;

import java.util.ArrayList;
import java.util.Collection;

public class Lab5 {
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("java"); col.add("hibernate");
	col.add("jdbc");col.add("spring");
	col.add("jsp");
	col.add("servlet");
	Collection col2=new ArrayList();
	col2.add("java");col2.add("jdbc");
	;col2.add("jsp"); col.add("neha");
	col2.add("kumari");
	
	System.out.println(col);
	System.out.println(col2);
	System.out.println("col.removeAll(col2)");
	//col.removeAll(col2);
	col.retainAll(col2);
	System.out.println(col);
	System.out.println(col2);
}
}
