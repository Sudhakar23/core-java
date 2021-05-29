package com.string;

import java.util.Stack;

public class String14 {
    public StringBuilder reverseWord(String input) {
        char separator = ' ';
        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder(chars.length);


        for(int i = 0; i < chars.length; i++) {

            if(chars[i] != separator) { //letters
                stack.push(chars[i]);

                //if not last letter don't go any further
                if(i != chars.length - 1) { continue; }

            }

            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.append(separator);

        }
        //remove the last separator
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }
}
