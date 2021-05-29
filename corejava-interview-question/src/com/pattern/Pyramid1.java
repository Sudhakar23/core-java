package com.pattern;

public class Pyramid1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Type in an integer value");
        int input = 5;
        String str = "";
        for(int i=1;i<=input;i++){
            str += ""+i;
            System.out.println(str);
        }
    }
}