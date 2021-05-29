package com.java.design.builder;

public class Account {
	private int id;
	private String email;
	private Address address;
	private Name name;

	private Account(Builder builder) {
		this.id = builder.id;
		this.email = builder.email;
		this.address = builder.address;
		this.name = builder.name;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public Name getName() {
		return name;
	}

	public static class Builder {
		private int id;
		private String email;
		private Address address;
		private Name name;

		public Builder id(final int id) {
			this.id = id;
			return this;
		}

		public Builder email(final String email) {
			this.email = email;
			return this;
		}

		public Builder address(final Address address) {
			this.address = address;
			return this;
		}

		public Builder name(final Name name) {
			this.name = name;
			return this;
		}

		public Account buld() {
			return new Account(this);
		}
	}
}
