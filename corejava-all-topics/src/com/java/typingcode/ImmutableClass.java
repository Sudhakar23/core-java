package com.java.typingcode;

public  class ImmutableClass {
	private final int i;

	ImmutableClass(int i) {
		this.i = i;
	}

	public ImmutableClass m1(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableClass(i);
		}
	}
	public static void main(String[] args) {
		ImmutableClass ic=new ImmutableClass(10);
		ImmutableClass ic1=ic.m1(100);
		ImmutableClass ic2=ic.m1(10);
		System.out.println(ic==ic1);
		System.out.println(ic==ic2);
	}
}


	

