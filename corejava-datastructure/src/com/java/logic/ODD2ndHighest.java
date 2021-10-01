package com.java.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ODD2ndHighest {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		int Temp;
		int arr[]=new int[10];
		for(int i=0;i<=10; i++){
			al.add(i);
		}
		Integer[] str=new Integer[4];
		str=al.toArray(str);
		for(int j=0;j<str.length;j++){
			
			if(str[j]%2==0){
				
			}else{
				arr[j]=str[j];
				
			}
			
		}
		
	}

}