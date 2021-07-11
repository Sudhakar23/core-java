package com.java.thread.jenkov.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Implementation of Lock more than one times 
// first lock -- at calculate()
// second lock -- at add() / substract() depending upon case.
public class ConcurrentCalculator {

	public static class Calculator {
		public static final int UNSPECIFIED = -1;
		public static final int ADDITION = 0;
		public static final int SUBSTRACTION = 1;
		
		int type = UNSPECIFIED;
		
		public double value;
		public Calculator(int type, double value) {
			this.type = type;
			this.value = value;
		}
		
		private double result = 0.0D;
		Lock lock = new ReentrantLock();
		
		public void add(double value) {
			try {
				lock.lock();
				this.result += value;
				
			}finally {
				lock.unlock();
			}
		}
		
		public void substract(double value) {
			try {
				lock.lock();
				this.result -= value;
				
			}finally {
				lock.unlock();
			}
		}
		
		public void calculate(Calculation ... calculations) {
			try {
				lock.unlock();
				for(Calculation calculation : calculations) {
					switch(calculation.type) {
					case Calculation.ADDITION		: add		 (calculation.value);break;
					case Calculation.SUBSTRACTION	: subtraction(calculation.value);break;
					}
				}
				
			}finally {
				lock.unlock();
			}
		}
		
		
		
	}

}
