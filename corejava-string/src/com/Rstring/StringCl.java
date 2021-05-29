package com.Rstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCl {
public static void main(String[] args) {
	String str=" MY NAME IS SUDHAKAR";
	System.out.println(StringreversQ.MethodForRevers(str));
	/*StringBuffer sb=new StringBuffer("kumar");
	System.out.println(sb.reverse());
*/}
}
class StringreversQ{
	public static String MethodForRevers(String s){
		
		String str1="";
		for (int i = s.length()-1; i >=0 ; i--) {
			str1=str1+s.charAt(i);
			//System.out.println(str.charAt(i));
		}
		System.out.print(str1);
		return str1;
	}
}
