package com.java.collection.lara.r;

import java.util.Hashtable;

class P {
	int i;

	P(int i) {
		this.i = i;
	}

	public String toString() {
		return "(i=" + i + ")";
	}
}

class Q {
	static int i;

	Q(int i) {
		this.i = i;
	}

	public String toString() {
		return "(i=" + i + ")";
	}

	public int hashCode() {
		return Integer.toString(i).hashCode();
	}
}

public class M38 {
	public static void main(String[] args) {

	}
}
