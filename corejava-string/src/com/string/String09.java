package com.string;

public class String09 {
	public static String reverseString(String str)
	{
	    String[] rstr;
	    String result = "";
	    int count = 0;
	    rstr = str.split(" ");
	    String words[] = new String[rstr.length];
	    for(int i = rstr.length-1; i >= 0; i--)
	    {
	        words[count] = rstr[i];
	        count++;
	    }

	    for(int j = 0; j <= words.length-1; j++)
	    {
	        result += words[j] + " ";
	    }

	    return result;

	}
}
