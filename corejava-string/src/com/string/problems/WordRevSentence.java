package com.string.problems;

public class WordRevSentence {
public static void main(String[] args) {
	String str="MY NAME IS Sudhakar";
	String strRev="";
	for (String s : str.split(" ")) {
		strRev=re(s)+strRev;
	}
	System.out.print(strRev);
}
static StringBuffer re(String str){
	StringBuffer sb = new StringBuffer();
	for (int i = str.length()-1; i >=0; i--) {
//		System.out.print(str.charAt(i));
		sb.append(str.charAt(i));
	}
	return sb.append(" ");
}
}