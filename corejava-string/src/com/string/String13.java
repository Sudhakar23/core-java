package com.string;

public class String13 {
	public static void main(String[] args) {
        System.out.println(eatWord(new StringBuilder("Hello World This Is Tony's Code"), new StringBuilder(), new StringBuilder()));
    }
static StringBuilder eatWord(StringBuilder feed, StringBuilder swallowed, StringBuilder digested) {
    for (int i = 0, size = feed.length(); i <= size; i++) {
        if (feed.indexOf(" ") == 0 || feed.length() == 0) {
            digested.append(swallowed + " ");
            swallowed = new StringBuilder();
        } else {
            swallowed.insert(0, feed.charAt(0));
        }
        feed = (feed.length() > 0)  ? feed.delete(0, 1) : feed ;
    }
    return digested;
}
}
