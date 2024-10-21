package com.java.design.builder;

public class Address {
	private int houseNo;
	private String street;
	private String zipcode;
	private String city;
	
	private Address(Builder builder){
		this.houseNo = builder.houseNo;
	}
	
	public int getHouseNo() {
		return houseNo;
	}

	public static class Builder{
		private int houseNo;
		
		public Builder houseNo(final int houseNo){
			this.houseNo = houseNo;
			return this;
		}
		public Address build(){
			return new Address(this);
		}
		
	}
	
}
