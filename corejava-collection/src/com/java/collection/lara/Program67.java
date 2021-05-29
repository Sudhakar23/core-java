package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FF {
	int i, j;

	FF(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + i + "," + j + ")";
	}

	class G1 implements Comparator {
		@Override
		public int compare(Object o1, Object o2) {
			FF f1 = (FF) o1;
			FF f2 = (FF) o2;
			return f1.i - f2.i;
		}
	}
}



public class Program67 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new FF(1, 0));
		al.add(new FF(6, 2));
		al.add(new FF(0, 8));
		al.add(new FF(2, 5));
		al.add(new FF(5, 1));
		System.out.println(al);
		//Collections.sort(al, new G1());
		System.out.println(al);
		//Collections.sort(al, new F1(). new H1());
	}
}
