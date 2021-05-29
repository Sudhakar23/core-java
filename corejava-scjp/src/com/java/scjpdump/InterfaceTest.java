package com.java.scjpdump;

public class InterfaceTest {
	public static final int i = 10;
	public static void main(String[] args) {
		Interface1 intr = new Interface1() {
			@Override
			public void go() {
				System.out.println("hi");
			}
		};
		intr.go();
	}
}