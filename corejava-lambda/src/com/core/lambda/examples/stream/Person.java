
package com.core.lambda.examples.stream;

import java.util.List;

class Person {
	private String 		 name;
	private int 		 billion;
	private List<String> phoneNumbers;

	public Person(String name, int billion) {
		super();
		this.name = name;
		this.billion = billion;
	}
	
	public Person(String name, int billion, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.billion = billion;
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBillion() {
		return billion;
	}

	public void setBillion(int billion) {
		this.billion = billion;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}