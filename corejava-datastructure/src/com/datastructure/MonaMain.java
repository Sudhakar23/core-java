package com.datastructure;
import java.util.ArrayList;

class FundNotEnough extends Exception {
	FundNotEnough(String s) {
		super(s);
	}
}

class Input {
	void mothed() throws FundNotEnough {
		throw new FundNotEnough("FundNotEnough");
	}
}

public class MonaMain {
	public static void main(String[] args) {
		ArrayList al;
		try {
			new Input().mothed();
		} catch (FundNotEnough f) {
			System.out.println(f.getMessage());
		}
	}
}
