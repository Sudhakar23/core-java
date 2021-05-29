package com.java.collection.manish;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab9 {
public static void main(String[] args) {
List list=new ArrayList();
list.add("sri");list.add("nivash");list.add("dande");
list.add("kumar");list.add("manish");list.add("ajay");
list.add("dhiraj");list.add("singh");list.add("amit");
ListIterator it=list.listIterator();
while (it.hasNext()) {
	int index=it.nextIndex();
	Object obj=it.next();
	//System.out.println(index+"\t"+obj);
}
System.out.println("\n***reverse Order");
while (it.hasNext()) {
	Object obj=it.hasPrevious();
	System.out.println(obj);
	if (obj.equals("manish")) {
		it.remove();
		
	}else if(obj.equals("sri")){
	it.set("JLC");
}
}
System.out.println("\n"+list);
System.out.println("\n***forward from 3rd index");
it=list.listIterator(3);
do{
	Object obj=it.next();
	System.out.println(obj);
}while(it.hasNext());
	System.out.println("\n***reverse from 3rd index");
it=list.listIterator(3);
do{
	Object obj=it.previous();
	System.out.println(obj);
}while(it.hasPrevious());
 }
}
