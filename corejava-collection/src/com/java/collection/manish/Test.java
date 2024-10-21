package com.java.collection.manish;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		Collection col1=new ArrayList();
		Collection col2=new ArrayList();
		col1.add("qqq");
		col2.add("www");
		col.add("nivash");col.add("rrr");col.add("rewqwe");col.add("manish");col.add("kumar");
		col2.addAll(col);
		System.out.println(col);
		System.out.println(col2);
	}
}
