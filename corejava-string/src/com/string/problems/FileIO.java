package com.string.problems;

import java.io.*;

public class FileIO implements Serializable{
	transient int i = 10;
	final static int j = 20;
		public static void main(String[] args) throws Exception {
			FileIO t =new FileIO();
			FileOutputStream fl=new FileOutputStream("example.txt");
			ObjectOutputStream ol=new ObjectOutputStream(fl);
			ol.writeObject(t);
			
			FileInputStream fi=new FileInputStream("example.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			FileIO t1=(FileIO)oi.readObject();
			System.out.println(t1.i+"........."+t1.j);
			
		}
}
