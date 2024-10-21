package com.java.cloning;

public class Lab3 {

	public static void main(String[] args)throws CloneNotSupportedException {
		Employee emp1 = new Employee(88,"Sudhakar");
		emp1.showClone();
		System.out.println("\n---------------------------");
		LoginInfo log = new LoginInfo(101, "javasree","jlcindia");
		Address ad = new Address("#123","Koramangala",232323);
		Student st = new Student(99, "sudha", 2435, ad, log);
		System.out.println(st);
		Student stud = (Student)st.clone();
		System.out.println("\n **** After Cloing the Object ***");
		System.out.println("st==stud                 :" +(st == stud));
		System.out.println("st.studAdd==stud.studAdd :" +(st.studAdd == stud.studAdd));
		System.out.println("st.login==stud.login     :" +(st.login == stud.login));
		System.out.println("st   :" +st);
		System.out.println("stud :" +stud);
		System.out.println("\n======= Modifying the Data =========");
		stud.sid = 90909;
		stud.name = "Mogli";
		stud.phone = 2435;
		stud.studAdd.street = "1stBlock";
		stud.login.uname = "jlcuser";
		System.out.println("st   :" +st);
		System.out.println("stud :" +stud);
	}
}

class Student implements Cloneable{
	int sid;
	String name;
	long phone;
	Address studAdd;
	LoginInfo login;
	public Student(int sid, String name, long phone, Address studAdd,
			LoginInfo login) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.studAdd = studAdd;
		this.login = login;
	}
	
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone
				+ ", studAdd=" + studAdd + ", login=" + login + "]";
	}
	public Object clone()throws CloneNotSupportedException{
		Object obj = null;
		if(this instanceof Cloneable){
			Address ad = new Address(this.studAdd.aid,
									this.studAdd.street,
									this.studAdd.pin);
			LoginInfo info = new LoginInfo(this.login.loginId,
										this.login.uname,
										this.login.pwd);
			obj = new Student(this.sid,this.name,this.phone,ad,info);
		}else{
			throw new CloneNotSupportedException(this.getClass().getName());
		}
		return obj;
	}	
}

class Employee implements Cloneable{
	int eid;
	String name;
	public Employee(int eid, String name){
		this.eid = eid;
		this.name = name;		
		System.out.println("--Employee(int, String)--");
	}
	public String toString(){
		return eid+"\t" +name;
	}	
	void showClone()throws CloneNotSupportedException{
		Employee ep = (Employee)clone();
		System.out.println("this       :" +this);
		System.out.println("Colone Obj :" +ep);
		System.out.println("this == ep :"+(this == ep));
	}
}


class Address{
	String aid;
	String street;
	int pin;
	public Address(String aid, String street, int pin) {
		super();
		this.aid = aid;
		this.street = street;
		this.pin = pin;
	}
	public String toString(){
		return aid+"\t"+street+"\t"+pin;
	}

}
class LoginInfo{
	int loginId;
	String uname;
	String pwd;
	
	public LoginInfo(int loginId, String uname, String pwd) {
		super();
		this.loginId = loginId;
		this.uname = uname;
		this.pwd = pwd;
	}

	public String toString(){
		return loginId+"\t"+uname+"\t"+pwd;
	}
}
