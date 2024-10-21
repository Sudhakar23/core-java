package com.java.collection.deveOwnLinkListClass;

import java.util.LinkedList;

class Element {
	Object data;
	Element next;
}

class linkList {
	Element font, back;

	public void add(Object obj) {
		Element e1 = new Element();
		e1.data = obj;
		if (font == null) {
			font = e1;
		} else {
			back.next = e1;
		}
		back = e1;
	}

	public void iterator() {
		Element e1 = font;
		while (e1 != null) {
			System.out.println(e1.data);
			e1 = e1.next;

		}
	}
}

public class Manager {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("abc");
		list.add(10);
		list.add("xyz");
		list.add("hello");
		list.iterator();
		System.out.println(list);
	}
}
