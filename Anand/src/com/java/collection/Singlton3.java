package com.java.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Singlton3 implements Serializable {
	 int a=10;
	 
	private static Singlton3 Instance=new Singlton3();
	
	protected Singlton3() {
		
	}
	protected Object readResolve(){
		return Instance;
		
	}
	public static Singlton3 getInstance() {
		return Instance;
	}
	@Override
	public String toString() {
		
		return "a"+a;
	}
	
	public static void main(String[] args) throws IOException {
		Singlton3 so=Singlton3.getInstance();
		
		FileOutputStream fs=new FileOutputStream("testSer.ser");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(so);
		System.out.println(so.hashCode());
	
		os.close();
		
		Singlton3 s=null;
		try{
			FileInputStream fis=new FileInputStream("testSer.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s=(Singlton3)ois.readObject();
			//s.readResolve();
			System.out.println(s.hashCode());
		
			System.out.println(s);
			
		}catch (Exception e) {
		
		}
		
		
		

	}

}
