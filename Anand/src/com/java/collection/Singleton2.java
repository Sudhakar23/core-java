package com.java.collection;

import java.io.Serializable;
interface inter{
	void show();
	 void display();
		
}
abstract class Helloo implements inter{

	@Override
	public void show() {
		 System.out.println("jtuit");
		
	}

	
	
}


class Student1 implements Serializable{
	protected Student1() {
	
	

	 
      
         
            
         
  
    }  
  
      
	

class Raju extends Student1{
	
        protected Object readResolve() {
			return null;  
           
        }  
  
    }  
	
	
	
}

public class Singleton2 {

	
	public static void main(String[] args) {
		

	}

}
