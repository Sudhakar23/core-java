package com.core.java.company.interview;

import java.lang.reflect.Array;
import java.util.*;


/**
 * @author SUDHAKAR
 * OneMobile
 */
public class VLA2_OneMobile implements Comparator<VLA2_OneMobile> {
	int dishSize;

	public static void main(String[] args) {
		VLA2_OneMobile[] va = { new VLA2_OneMobile(40), new VLA2_OneMobile(200), new VLA2_OneMobile(60) };
		// VLA2[] va={new VLA2(40), new VLA2(200)};
		System.out.println(va.toString() + "----");

		// Arrays.sort(va, va[0]);
		/*
		 * int index=Arrays.binarySearch(va,new VLA2(40),va[0]);
		 * System.out.println(index+ " ");
		 */

		int index = Arrays.binarySearch(va, new VLA2_OneMobile(80), va[0]);
		System.out.println(index);

	}

	@Override
	public int compare(VLA2_OneMobile a, VLA2_OneMobile b) {

		return b.dishSize - a.dishSize;

	}

	/*
	 * public String toString(){ return dishSize+" "; }
	 */
	VLA2_OneMobile(int d) {
		dishSize = d;
	}
}
