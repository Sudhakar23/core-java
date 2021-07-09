package com.java.corejava;

import java.util.Map;
import java.util.TreeMap;

class Z {
	public void Z(int a) {
	}
}

class X extends Z {

}

/*
 * class A44 { public int method1(int a,int b){return 0;} } class B44 extends
 * A44{ public int method1(int a, int b){return 0;} }
 */
public class Ques54 {
	public static void main(String[] args) {
		/*
		 * Map map= new TreeMap(); map.put("KeyStr", null); System.out.println(map);
		 */
		int i = 0;
		while (true) {
			if (i++ == 4) {
				break;
			}
			++i;
		}
		System.out.println("i=" + (i++));
	}
}
