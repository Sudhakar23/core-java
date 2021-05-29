package com.Exception;

class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
} /* Line 2 */

class Exc2 extends Exception {
}

public class Test {
	public static Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		try {
			throw new Exc0(); /* Line 9 */
		} catch (Exc1 e0) /* Line 11 */
		{
			System.out.println("Ex0 caught");
		} catch (Exception e) {
			System.out.println("exception caught");
		}
	}
}
