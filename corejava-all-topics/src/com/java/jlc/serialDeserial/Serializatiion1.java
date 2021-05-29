package com.java.jlc.serialDeserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test{
	int a = 10;
}

public class Serializatiion1 implements Serializable{
	public static void main(String[] args)throws IOException {	
		Test tst = new Test();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("x123.txt"));
		System.out.println(oos);
	//	Object o  = oos.r                                                                                                                                                                                                                                                                                                                                                                                                       .
	}
}
