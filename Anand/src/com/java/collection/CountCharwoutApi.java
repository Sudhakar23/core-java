package com.java.collection;


public class CountCharwoutApi {

	public static void main(String[] args) {
		
		String userInput="ANAFDQWFGGG";
		String input = userInput.toLowerCase();// Make your input toLowerCase.
	    int[] arr = new int[26];
	    for ( int i = 0; i < input.length(); i++ ) {
	         char ch=  input.charAt(i);
	         int value = (int)ch;
	         if (value >= 97 && value <= 122){
	         arr[ch-'a']++;
	        }
	    }
	    for (int i = 0; i < arr.length; i++) {
	        if(arr[i]>0){
	          char ch = (char) (i+97);
	          System.out.println(ch +"  : "+arr[i]);   //Show the result.
	        }         
	   }
		

	}

}
