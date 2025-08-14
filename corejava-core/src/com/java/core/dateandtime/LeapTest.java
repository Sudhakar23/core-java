package com.java.core.dateandtime;

import java.time.Year;

public class LeapTest {
	public static void main(String[] args) {
		Year year = Year.of(1890);
		System.out.println(year.isLeap());
	}
}	
