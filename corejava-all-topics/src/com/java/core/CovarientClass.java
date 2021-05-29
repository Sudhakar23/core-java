package com.java.core;

class Alpha{
	public Alpha m1() {
		return new Alpha();	
	}
}
class Beta extends Alpha{
	@Override
	public Beta m1() {
		return new Beta();
	}
}

public class CovarientClass {

}
