package com.khalid.ExceptionHandlingQues;

class SubException extends Exception {
}

class SubSubException extends SubException {
}

public class CC {
	void doStuff() throws SubException {
	}
}

class CC2 extends CC {
	void doStuff() throws SubSubException {
	}
}

class CC3 extends CC {
	void doStuff() throws SubSubException {
	}
}
