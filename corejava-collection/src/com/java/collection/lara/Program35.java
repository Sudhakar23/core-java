package com.java.collection.lara;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class F2 {
	int i, j;

	F2(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "(" + i + "," + j + ")";
	}
}

class GG implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		F2 f;
		F2 f1 = (F2) o1;
		F2 f3 = (F2) o2;
		return f1.i - f3.i;
	}
}

class H1 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		F2 f1 = (F2) o1;
		F2 f3 = (F2) o2;
		return f1.i - f3.i;
	}
}

public class Program35 {
	public static void main(String[] args) {
		F2[] x = { new F2(1, 9), new F2(5, 1), new F2(2, 3), new F2(9, 5),
				new F2(3, 8), new F2(7, 4), };
		System.out.println(Arrays.toString(x));
//		Arrays.sort(x, new GG());
		Collections.reverseOrder();
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, new H1());
		System.out.println(Arrays.toString(x));
	}
}
