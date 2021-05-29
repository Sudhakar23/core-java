package com.java.tst;

import java.util.Date;

public class ImmutableDemo {
	Date date;
	String string;

	public ImmutableDemo(Date date, String string) {
		this.date = date;
		this.string = string;
	}

	public static void modify(Date dateNew, String stringNew) {
		dateNew = new Date(dateNew.getTime() + 86400000);
		stringNew = "SOMETHING";
	}

	@Override
	public String toString() {
		return date + " %%% " + string;
	}

	public static void main(String[] args) {
		ImmutableDemo id = new ImmutableDemo(new Date(), "NOT SOMETHING");
		System.out.println(id);
		modify(id.date, id.string);
		System.out.println(id);
	}
}