package com.string;

public class String11 {
	public static void main(String[] args){
	    //initiate vars
	    String s = "Hello World!";
	    String rev = "";
	    int length = s.length();
	    int counter = length;
	    /*for (int i = 0 ; i <length; i++){
	            rev += s.charAt(counter-1) ;
	            counter--;
	    }*/
	    for (int i = 0 ; i <s.length(); i++){
            rev += s.charAt(counter-1) ;
            counter--;
    }
	    System.out.println(rev);
	}
}
