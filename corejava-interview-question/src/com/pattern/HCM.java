package com.pattern;

class HCM {
	int a, b, num, hcd, hcm;

	void lcm() {
		a = Integer.parseInt(System.console().readLine("enter the first no.="));
		b = Integer.parseInt(System.console().readLine("enter the 2nd   no.="));
		int m = a * b;
		if (a > b) {
			num = a;
		} else {
			num = b;
		}
		for (int i = 1; i <= num; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				hcd = i;
			}

		}
		System.out.println("HCF=" + hcd);
		hcm = m / hcd;
		System.out.println("LCM=" + hcm);
	}

	public static void main(String[] args) {
		HCM ab = new HCM();
		ab.lcm();
	}
}