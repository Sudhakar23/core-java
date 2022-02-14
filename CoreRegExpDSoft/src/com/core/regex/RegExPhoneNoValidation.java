package com.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPhoneNoValidation {
	public static void main(String[] args) {
		Boolean result = RegExPhoneNoValidation.validatePhoneNo("89916302435");
		System.out.println(result);
	}
	
	public static Boolean validatePhoneNo(String phoneNo) {
		
		String regexPattern = "(0|91)?[6-9][0-9]{9}";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(phoneNo);
		
		System.out.println(m.find() +" : "+ m.group());
		
		if(m.find() && m.group().equals(phoneNo)) {
			return true;
		}
		return false;
	}
}
