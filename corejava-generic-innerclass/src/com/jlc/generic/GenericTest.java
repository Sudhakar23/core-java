package com.jlc.generic;

import java.util.Map;


public class GenericTest {
	public static void main(String[] args) {
		Book book = new Book();
		House house = new House();
		book.setObject(house);
		System.out.println(book.getObject());
		Map map;
	}
}
class House{
	public String toString(){
		return "House object.";
	}
}
class Book{
	Object object ;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}