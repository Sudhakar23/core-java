package com.core.lambda.durga.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo {

	public static void main(String[] args) {
		//Find Current system zone
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		//Get time of specific zone
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now();
		System.out.println(zt);

	}

}
