package com.java.thread.jenkov;

public class Exchanger2 {

	private 		 int val1;
	private 		 int val2;
	private volatile int val3;
	
	public void setValues(Values source) {
		this.val1 = source.getVal1();
		this.val2 = source.getVal2();

		this.val3 = source.getVal3(); // Writing to volatile variable should be at last.
	}
	
	public void getValues(Values destination) {
		destination.setVal3(this.val3); // Reading to volatile variable should be at start of block

		destination.setVal1(this.val1);
		destination.setVal2(this.val2);
	}
	

}

class Values{
	private int val1 ;
	private int val2 ;
	private int val3 ;
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public int getVal3() {
		return val3;
	}
	public void setVal3(int val3) {
		this.val3 = val3;
	}
	
	
}
