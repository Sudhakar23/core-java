package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exampale1 {
public static void main(String[] args) {
	List<Integer> mylist=new ArrayList<Integer>();
	mylist.add(4);
	mylist.add(6);
	mylist.add(6);
	int total=new Adder().addAll(mylist);
	System.out.println(total);
}
}
class Adder{
	int addAll(List list){
		Iterator it=list.iterator();
		int total=0;
		while(it.hasNext()){
			int i=((Integer)it.next());
			System.out.println(i);
			total +=i;
		}
		return total;
	}
}
