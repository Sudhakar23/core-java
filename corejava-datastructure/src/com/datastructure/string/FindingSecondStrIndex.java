package com.datastructure.string;

public class FindingSecondStrIndex {

	public static void main(String[] args) {

		String str = "abcdab";
		String strArr = str.strip();
		int i = 0;
		int j = i;
		for (; i < str.length(); ) {
			if (str.substring(i) == str.substring(j++)) {
				System.out.println(j);
			}
		}
	}

}
