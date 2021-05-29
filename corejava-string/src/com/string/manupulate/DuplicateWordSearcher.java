package com.string.manupulate;

import java.util.*;
 
public class DuplicateWordSearcher {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
        String text = "This test file is test in java This test file is test in java";
 
        List<String> list = Arrays.asList(text.split(" "));
        System.out.println(list);
 
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
        	
//            System.out.println(word + ": " + Collections.frequency(list, word));
            System.out.println(word +": " + Collections.frequency(list, word));
            //Collections.frequency(list, word);
//            System.out.println(": " + Collections.frequency());
//            int a = Collections.frequency(c, o);
            //System.out.println("End of code");
        }
    }
}