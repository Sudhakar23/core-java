package com.java.collection.lara.r;

import java.util.HashMap;

class M {
	int i;

	M(int i) {
		this.i = i;
	}

	public String toString() {
		return "(i=" + i + ")";
	}
}

public class M37 {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(10, "abc");
		m.put(10, "xyz");
		m.put("k1", 200);
		m.put("k1", "test");
		m.put(new M(10), 100);
		m.put(new M(10), 200);
		System.out.println(m);
	}
}
