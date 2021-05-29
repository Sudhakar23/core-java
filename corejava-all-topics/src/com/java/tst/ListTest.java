
package com.java.tst;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		List lt = new ArrayList();
		lt.add("ashu");
		lt.add("anand");
		lt.add("ujj");
		Iterator it = lt.iterator();
		System.out.println(lt.hashCode());
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Hashtable ab=new Hashtable<>();
	}
}