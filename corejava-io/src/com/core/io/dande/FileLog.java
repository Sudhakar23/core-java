package com.core.io.dande;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 
 * 
 */
class Employee implements Serializable {
	int a;
	int b;
	transient int c = 89;
	
	@Override
	public String toString() {
		return "a="+ a+"b="+b+"c="+c;
	}
	

}

public class FileLog {

	public static void main(String[] args)throws Exception {
		Employee em= new Employee();
		em.a=12;
		em.b=20;
		String url = "D:\\log.txt";
		File file = new File(url);
		FileOutputStream fos= new FileOutputStream(file);
		ObjectOutputStream os= new ObjectOutputStream(fos);
		os.writeObject(em);
		os.flush();
		os.close();
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream in= new ObjectInputStream(fis);
		Employee em1 = (Employee)in.readObject();
		System.out.println(em1);
		System.out.println("Done");
	}
}