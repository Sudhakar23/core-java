package com.lara.thread.exercise2;

import java.util.Scanner;

class J extends Thread {
	public void run() {
		int counter = 0;
		while (!isInterrupted()) {
			counter++;
			System.out.println(counter);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread Inturepted");
				break;
			}
		}
	}
}

public class Manager27 {
	public static void main(String[] args) {
		J obj = new J();
		obj.start();
		Scanner sc = new Scanner(System.in);
		String decider;
		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("continue ?(y/n)");
			decider = sc.next();
		} while ("y".equals(decider));
		obj.interrupt();
	}
}
