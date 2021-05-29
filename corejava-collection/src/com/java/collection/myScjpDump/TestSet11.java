package com.java.collection.myScjpDump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestSet11 {
	public static Iterator reverse(List list) {
		 Collections.reverse(list);
		 return list.iterator();
		 }
		 public static void main(String[] args) {
			
		 List list = new ArrayList();
		 list.add("1"); list.add("2"); list.add("3");
		 Iterator lt=reverse(list);
		 Object arr[]=new Object[3];
		 for(int i=0;lt.hasNext();i++){
			 arr[i]=lt.next();
		 }
		 for (Object obj:arr )
			 System.out.print(obj + ", ");
		 
		 /*while(lt.hasNext()){
			 System.out.println(lt.next()+", ");
		 }*/
		 }
}
