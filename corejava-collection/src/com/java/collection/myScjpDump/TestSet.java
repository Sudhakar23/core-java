package com.java.collection.myScjpDump;

import java.util.*;

public class TestSet {
	enum Example{one, two, three}
public static void main(String[] args) {
	Collection coll=new ArrayList();
	coll.add(Example.three);
	coll.add(Example.three);
	coll.add(Example.three);
	coll.add(Example.two);
	coll.add(Example.two);
	coll.add(Example.one);
	Set set=new HashSet();
	System.out.println(set);
	System.out.println(coll);
}
}
