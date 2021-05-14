package com.core.supplier.durga;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo01 {
	public static void main(String[] args) {
		SupplierDemo01.suppliers();
	}
	
	/**
	 * Supplier to get System Date.<br>
	 * Supplier to get random name from list.<br> 
	 * Supplier to ger 6 digit opt.
	 */
	public static void suppliers() {
		//System Date by Supplier
		Supplier<Date> supDate = () -> new Date();
		System.out.println(supDate.get());
		
		Supplier<String> sup = () -> {
			String[] sarr = {"Sunny", "Bunny", "Chinny","Tinni"};
			int x = (int)(Math.random() * 4) ;
			return sarr[x];
		};
		System.out.println(sup.get());
		
		//Supplier to get 6 digit opt no
		Supplier<Integer> supOtp = () -> {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 6; i++) {
				sb.append((int)(Math.random()*10));
			}
			return Integer.valueOf(sb.toString());
		};
		
		System.out.println("6 digit OTP : " + supOtp.get());

	}
}
