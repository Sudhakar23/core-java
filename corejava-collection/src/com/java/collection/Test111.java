package com.java.collection;

import java.util.*;

import org.omg.PortableInterceptor.Interceptor;
/*import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.jlc.p22.E;*/

public class Test111 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(11);
		hs.add(22);
		System.out.println(hs);
		/*for(Object o : hs){
			System.out.println(o);
		}*/
	
		/*System.out.println("Using Iterator");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		/*System.out.println(" **Using ListIterator** ");
		List l = new ArrayList(hs);
		ListIterator ls = l.listIterator();		
		while(ls.hasNext()){
			System.out.println(ls.next());
		}
		while(ls.hasPrevious()){
			System.out.println(ls.previous());
		}*/
		System.out.println("Linked HashSet");
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Integer(999));
		lhs.add(new Double(123.123));
		lhs.addAll(hs);
		System.out.println(lhs);
		
		System.out.println("LinkedHashSet using Iterator");
		Iterator it = lhs.iterator();
		while(it.hasNext()){
		 	System.out.println(it.next());
		}
		
		System.out.println("TreeSet");
		TreeSet ts = new TreeSet();
		ts.add("bb");
		ts.add("cc");
		ts.add("aa");
		System.out.println(ts);

		
		/*
		List lstAL = new ArrayList(lhs);
		ListIterator lstIt = lstAL.listIterator();
		while(lstIt.hasNext()){
			System.out.println(it.next());
		}*/
		/*while(lstIt.hasPrevious()){
			System.out.println(lstIt.previous());
		}*/
		
	}

}
