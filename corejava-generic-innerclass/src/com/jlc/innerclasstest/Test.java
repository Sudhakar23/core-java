package com.jlc.innerclasstest;

class P {
	static class Q {
		 static class R{
			static class S{
				void test() {
					class M{
						void m1(){
							System.out.println("Inside M");
						}
					}
					M m = new M();
					m.m1();
					System.out.println("inside show ");
				}
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		P.Q.R.S pq = new P.Q.R. S();
		pq.test();
	}
}
