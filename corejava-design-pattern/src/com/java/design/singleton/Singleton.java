package com.java.design.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

final class Hello implements Serializable {
	int a = 10;
	protected Hello() {
	}
	private static Hello h = new Hello();
	public Object readResolve() {
		return h;
	}
	@Override
	public String toString() {
		return "a" + a;
	}
	public static Hello getInstance() {
		return h;
	}
}

public class Singleton {
	public static void main(String[] args) {
		Hello h = null;
		h = h.getInstance();
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(h);
			System.out.println(h.hashCode());
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			h = (Hello) ois.readObject();
			System.out.println(h.hashCode() == h.hashCode());
			System.out.println(h.hashCode());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
