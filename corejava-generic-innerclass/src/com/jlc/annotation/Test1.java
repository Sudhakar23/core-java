package com.jlc.annotation;
import java.lang.Exception;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.annotation.*;
public class Test1 {

	public static void main(String[] args)throws Exception {
		MyExecutor ex = new MyExecutor();
		

	}

}
@Retention(RetentionPolicy.RUNTIME)
@interface Executable{
	
}
abstract class Executor{
	final public void execute(String fileName)throws Exception{
		Runtime rt = Runtime.getRuntime();
		boolean process = false;
		process = this.getClass().isAnnotationPresent(Executable.class);
		if(process){
			rt.exec(fileName);
		}else{
			throw new Exception(this.getClass().getName() +"is not executable");
		}
	}
}
@Executable
class MyExecutor extends Executor{
	
}
class Person{
	
}
@Table(name="stud Table")
class Student{
	@Column(name = "sid")
	int studId;
	
	@Column(name = "sfee")
	float studFee;
	long phone;
	
	@Column(name = "sname")
	String studName;
}
@Table(name = "empTable")
class Employee{
	@Column(name = "cid")
	int empId;
	
	@Column(name = "eage")
	int age;
	
	@Column(name = "ename")
	String empName;
	
	@Column(name = "ephone")
	long empPhone;
	
}
//Implemented by JLC Vendor
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Table{
	String name();
}
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Column{
	String name();
}
class JLCResource{
	public void save(Object obj) throws Exception{
		boolean tabPresent = obj.getClass().isAnnotationPresent(Table.class);
		if(tabPresent){
			Table tab = obj.getClass().getAnnotation(Table.class);
			String tableName = tab.name();
			String qry = "insert into" +tableName;
			StringBuffer cols = new StringBuffer("(");
			StringBuffer values = new StringBuffer("values(");
			Field fs[] = obj.getClass().getDeclaredFields();
			for (int i = 0; i < fs.length; i++) {
				Field f1 = fs[i];
				boolean colPresent = f1.isAnnotationPresent(Column.class);
				if(colPresent){
					String colName = f1.getAnnotation(Column.class).name();
					cols.append(colName +",");
				}
			
				String type = f1.getType().getSimpleName();
				if(type.equals("int")){
					int val = f1.getInt(obj);
					values.append(val);
					values.append(",");
				}else if(type.equals("String")){
					String val = f1.get(obj).toString();
					values.append("'");
					values.append(val);
					values.append("',");					
				}else if(type.equals("long")){
					long val = f1.getLong(obj);
					values.append(val);
					values.append(",");
				}else if (type.equals("float")){
					float val = f1.getFloat(obj);
					values.append(val);
					values.append(",");
				}				
			}			
		
		qry = qry + cols.substring(0,cols.length()-1)
				+ ")" + values.substring(0, values.length()-1) +")";
		System.out.println(qry);
		//Code to store in DB
		}else{
			
		}		
	}
}