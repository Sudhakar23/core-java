package com.java.w1.arrays;

public class ArmstrongNum {

	public static void main(String[] args) {
		// 153 = 1^3+5^3+3^3 -> 1+75+27
		ArmstrongNum armstrongNum = new ArmstrongNum();
		for (long i = 1; i < 500; i++) {
			long numTemp = i;
			long sum = 0;
			while (numTemp > 0) {
				sum += armstrongNum.power((numTemp % 10), 3);
				numTemp /= 10;
			}
			//System.out.print("Number " +i +"::" +"sum " +sum);
			if (sum == i) {
				System.out.println(" *****Armstrong " + i +"*******");
			}
//			System.out.println();
		}
	}

//	public long power(long x, long y) {
//		long result = 1;
//		for (int i = 0; i < y; i++) {
//			result = x * result;
//		}
//		return result;
//	}
	
	public <T> long power(T x, T y) {
		long result = 1;
		for (int i = 0; i < (int)y; i++) {
			result = (long)x * result;
		}
		return result;
	}
}
