package com.pattern;

public class PyramidNo {
	public static void main(String[] args) {

		int rw = 0, c = 0, no = 0, spc = 0;
		no = 5;
		for (rw = 1; rw <= no; rw++) {
			for (spc = no; spc >= rw; spc--) {
				System.out.print(" ");
			}
			for (c = 1; c <= rw; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}