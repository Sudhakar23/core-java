package com.string;

public class String07 {

	public static void main(String[] args) {
		String str = "sudhakar";
		System.out.println(reverse(str));
	}
	public static String reverse(String str_words){
	    StringBuilder sb_result = new StringBuilder(str_words.length());
	    StringBuilder sb_tmp = new StringBuilder();
	    char c_tmp;
	    for(int i = 0; i < str_words.length(); i++){
	        c_tmp = str_words.charAt(i);    
	        if(c_tmp == ' ' || c_tmp == '\n'){
	            if(sb_tmp.length() != 0){   
	                sb_tmp.reverse();
	                sb_result.append(sb_tmp);
	                sb_tmp.setLength(0);
	            }   
	            sb_result.append(c_tmp);
	        }else{
	            sb_tmp.append(c_tmp);
	        }
	    } 
	    if(sb_tmp.length() != 0){
	        sb_tmp.reverse();
	        sb_result.append(sb_tmp);
	    }
	    return sb_result.toString();
	}
	
}
