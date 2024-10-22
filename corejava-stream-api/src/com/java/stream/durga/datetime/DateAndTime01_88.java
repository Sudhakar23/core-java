package com.java.stream.durga.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTime01_88 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);//2021-05-29T17:14:36.076899
		System.out.println(dt.getDayOfMonth());//29
		System.out.println(dt.getHour());//17
		System.out.println(dt.getNano());//798279400
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld.plusDays(84));
		
		System.out.println(dt.plusDays(84));//
		System.out.println(dt.minusDays(84));//
		
		
		LocalDateTime custDateTime = LocalDateTime.of(1980,Month.JANUARY,23,10,11,56,234);
		System.out.println(custDateTime);
		System.out.println(custDateTime.plusMonths(2));
		System.out.println(custDateTime);
		System.out.println(custDateTime);
		
	}

}
