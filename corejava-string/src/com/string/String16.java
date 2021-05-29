package com.string;

public class String16 {
public static void main(String[] args) {
    String input = "Hello World!";

    String temp = "";
    String result = "";

    for (int i = 0; i <= input.length(); i++) {
        if (i != input.length() && input.charAt(i) != ' ') {
            temp = input.charAt(i) + temp;
        } else {
            result = temp + " " + result;
            temp = "";
        }
    }

    System.out.println("the result is: " + result);
}
}
