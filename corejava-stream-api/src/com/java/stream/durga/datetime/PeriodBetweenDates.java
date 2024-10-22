package com.java.stream.durga.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodBetweenDates {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate bDay = LocalDate.of(1980,Month.JANUARY,23);
		Period period = Period.between(bDay, today);
		
		System.out.println("Days "+period.getDays());
		System.out.println("Months "+period.getMonths());
		System.out.println("Years "+period.getYears());

		int noOfDays = period.getYears()*365+period.getMonths()*12+period.getDays();
		System.out.println("Total No of days " + noOfDays);
		
	}
}