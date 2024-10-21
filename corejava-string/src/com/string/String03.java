package com.string;

public class String03 {
	static String reverse(String in, String out) {
        return (in.isEmpty()) ? out :
            (in.charAt(0) == ' ')
            ? out + ' ' + reverse(in.substring(1), "")
            : reverse(in.substring(1), in.charAt(0) + out);
    }
	static String reverseString(String string){
	    String newString = "";
	    for(int x = string.length() - 1; x > -1; --x)
	        newString += string.charAt(x);
	    return newString;
	}
    public static void main(String args[]) {
//        System.out.println(reverse("Hello World", ""));
        System.out.println(reverseString("Hello World"));
        System.out.println(reverseString("Hello World"));
    }
}