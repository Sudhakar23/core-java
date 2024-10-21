package com.java.jlc.generic;

import java.util.*;

class Hello {
	void m1() {
		System.out.println("M1 in Hello");
	}
}

public class Test1 {
	static void m11() {
		System.out.println("m11 in Test1");

		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(123);
		a1.add(new Hello());
		Iterator it = a1.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			if (o instanceof Integer)
				System.out.println(o);
			else if (o instanceof Double)
				System.out.println(o);
			else if (o instanceof String)
				System.out.println(o);
			else
				System.out.println(o);
		}
	}

	static ArrayList<String> m22() {
		ArrayList<String> a12 = new ArrayList<String>();
		a12.add("abc");
		a12.add("xyz");
		a12.add("jlc1");
		return a12;
	}

	static void m33() {
		System.out.println("M33 in Test1");
		ArrayList<String> a13 = m22();
		for (String str : a13) {
			System.out.println(str);
		}

	}

	static void m44() {
		System.out.println("m44 in Test1");
		ArrayList<Integer> a14 = new ArrayList<Integer>();
		a14.add(new Integer(9999));
		a14.add(3333);
		a14.add(new Integer(88888));
		for (Integer i1 : a14) {
			System.out.println(i1);
		}
	}

	static void m55() {
		System.out.println("m55 in Test1");
		HashSet<Hello> hs = new HashSet<Hello>();
		hs.add(new Hello());
		hs.add(new Hello());
		for (Hello h1 : hs) {
			System.out.println(h1);
		}
	}

	static void m66() {
		System.out.println("m66 in Test1");
		// HashMap<String, String > hm = new HashMap<String, String>();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("11", "som");
		hm.put("22", "abc");
		hm.put("33", "xyz");
		for (Map.Entry<String, String> me : hm.entrySet()) {
			System.out.println(me.getKey() + "..." + me.getValue());
		}
	}

	public static void main(String[] args) {
		m11();
	}
}
