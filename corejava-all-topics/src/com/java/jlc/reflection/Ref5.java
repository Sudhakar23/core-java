package com.java.jlc.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//Accessing the method Information
public class Ref5 {
public static void main(String[] args) throws Exception{
	Class cls=Class.forName("com.jlc.reflection.Student");
	Object st=new Student();
	Object test=new Ref5();
//	System.out.println(cls.isInstance(st));
//	System.out.println(cls.getName()+"\t" +st);
//	System.out.println(cls.isInstance(test));
	Method methods[]=cls.getDeclaredMethods(); int p=1;
//	for(int i=0;i<methods.length;i++){
		Method m=methods[0];
		System.out.println("======================\n"+p+"........");
		System.out.println(m);  p++;
		System.out.println("**NAME**\t:" +m.getName());
		Class retType=m.getReturnType();
		System.out.println("**RET Type\t:" +retType.getName());
		System.out.println("Interface\t:" +retType.isInterface());
		System.out.println("Primitive\t:"+ retType.isPrimitive());
		System.out.println("[]Arrays\t:"+retType.isArray());
		Class params[]=m.getParameterTypes();
		for(int j=0;j<params.length;j++){
			System.out.print(params[j]+", ");
		}
		int x=m.getModifiers();
		System.out.println("\nPUBLIC\t:"+Modifier.isPublic(x));
		System.out.println("FINAL\t:"+Modifier.isFinal(x));
		System.out.println("STATIC\t:" +Modifier.isStatic(x));
		System.out.println(Modifier.toString(x));
//	}
}
}

class Student{
	public synchronized void show(int ab, String name, boolean valid, long phone){}
	static final public String getName(int id, String email){
		return "";
	}
	public int showInformation(String email){
		return 0;
	}
	int [] getStudentIds(){
		return null;
	}
}