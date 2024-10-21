package com.java.jlc.locale;

import java.util.Locale;

public class Lab11 {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		Locale locales[] = Locale.getAvailableLocales();
		System.out.println(locales.length);
		for (int i = 0; i < locales.length; i++) {
//			System.out.print(locales[i] +", ");			
		}
		System.out.println();
		
		String countries[] = Locale.getISOCountries();
		System.out.println(countries.length);
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i] +", ");
		}
		System.out.println("\n=====================================\n");
		Locale loc = new Locale("EN");
		System.out.println(loc.getCountry());
		System.out.println(loc.getDisplayCountry());
	}

}
