package com.designpattern.builder;

public class Customer {
	private String firstName;
	private String lastName;
	private String age;

	private Customer(CustomerBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
	}

	static class CustomerBuilder {
		private String firstName;
		private String lastName;
		private String age;

		public CustomerBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public CustomerBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public CustomerBuilder setAge(String age) {
			this.age = age;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
