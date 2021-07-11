package com.java.thread;


class CenterMethod {
	private int content;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();

			} catch (InterruptedException e) {

			}
		}
		available = false;
		notifyAll();
		return content;

	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		content = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private CenterMethod cm;
	private int number;

	public Consumer(CenterMethod cm, int number) {
		this.cm = cm;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 20; i++) {
			value = cm.get();
			// value=cm.get();
			System.out.println("cm# " + this.number + "  get= " + value);
		}
	}
}

class Producer extends Thread {
	private CenterMethod cm;
	private int number;

	public Producer(CenterMethod c, int number) {
		cm = c;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			cm.put(i);
			// cm.put(i);
			System.out.println("cmp " + this.number + "  put= " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}

	}
}
public class ProducerConsumer {
	public static void main(String[] args) {
		CenterMethod c2 = new CenterMethod();
		Consumer c1 = new Consumer(c2, 1);
		Producer p1 = new Producer(c2, 2);
		c1.start();
		p1.start();
	}
}