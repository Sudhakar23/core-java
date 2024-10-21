package com.java.serial;

import java.io.*;

public class T implements Serializable{
	transient int i = 10;
	transient static int j = 20;
		public static void main(String[] args) throws Exception {
			T t =new T();
			FileOutputStream fl=new FileOutputStream("fileEx.txt");
			ObjectOutputStream ol=new ObjectOutputStream(fl);
			ol.writeObject(t);
			
			FileInputStream fi=new FileInputStream("fileEx.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			T t1=(T)oi.readObject();
			System.out.println(t1.i+"........."+t1.j);
		}
}
