package com.java.logic;
import java.util.ArrayList;
import java.util.HashSet;

public class CompareListLab {
	public static void main(String[] args) {
		// compare element using containall
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(13);
		al.add(15);
		al.add(14);
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(13);
		al1.add(16);
		// al.containsAll(al1);
		// System.out.println(al);
		// System.out.println(al.containsAll(al1));
		// compare element 2nd method of list
		HashSet same = new HashSet(al);
		HashSet diff = new HashSet();
		diff.addAll(al);
		diff.addAll(al1);
		System.out.println(diff);
		same.retainAll(al1);
		System.out.println("sss" + same);
		diff.remove(same);
		System.out.println("Same " + same);
		System.out.println("diff " + diff);
	}
}
