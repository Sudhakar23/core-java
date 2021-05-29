package com.string;

public class String17 {
	public static void main(String[] args) {
		
	}
	public String reverse(String post)
	{       
	    String backward = "";
	    for(int i = post.length()-1; i >= 0; i--) {
	        backward = backward + post.substring(i, i+1);
	    }        
	    return backward;
	}
}
