package com.java.design.singleton.ranjith;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTestSerialDeserial {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//Serialization / Deserialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
		oos.writeObject(s2);
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
		Singleton s3 = (Singleton) ois.readObject();
		System.out.println(s3.hashCode());
		
	}
}
