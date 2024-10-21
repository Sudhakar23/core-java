package com.java.thread.lara.thread.dead;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Util {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Stared {
	synchronized void test1(Stared s) {
		System.out.println("test being");
		Util.sleep(1000);
		s.test2(this);
	}

	synchronized void test2(Stared s) {
		System.out.println("test2 being");
		Util.sleep(1000);
		s.test1(this);
	}
}

class A10 extends Thread {
	Stared s1, s2;

	A10(Stared s1, Stared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s1.test1(s2);
	}
}

class B extends Thread {
	Stared s1, s2;

	B(Stared s1, Stared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s2.test2(s1);
	}
}

public class Manager1 {
	public static void main(String[] args) {
		Stared s1 = new Stared();
		Stared s2 = new Stared();
		A10 a1 = new A10(s1, s2);
		B b1 = new B(s1, s2);
		a1.start();
		b1.start();
		Util.sleep(1000);
		ThreadMXBean mx = ManagementFactory.getThreadMXBean();
		long ids[] = mx.findDeadlockedThreads();
		if (ids != null) {
			ThreadInfo x[] = mx.getThreadInfo(ids);
			for (ThreadInfo info : x) {
				System.out.println(info.getThreadName());
			}
		} else {
			System.out.println("no threads are under deadlock");
		}
	}
}
