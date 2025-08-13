package com.java.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;


//import com.java.stream.durga.Employee;

public class TreeMapCustomClassLambda_18 {

	public static void main(String[] args) {
		
		EmpLocal emp1 = new EmpLocal(2, "Two");
		EmpLocal emp2 = new EmpLocal(4, "Four");
		EmpLocal emp3 = new EmpLocal(1, "One");
		EmpLocal emp4 = new EmpLocal(3, "Three");
		
		TreeMap<Integer, String> tMap = new TreeMap<>((i1, i2) -> (i1>i2) ? -1 : (i1<i2)?1 : 0 );
		tMap.put(1, "One");
		tMap.put(4, "Four");
		tMap.put(2, "Two");
		tMap.put(3, "Three");
		
		System.out.println(tMap);
		
//		Collections.sort(tMap, new CustomeComparator());
		
	}
}

class CustomeComparator implements Comparator<EmpLocal>{
	public int compare(EmpLocal e1, EmpLocal e2) {
		return e1.getEmpno() > e2.getEmpno() ? -1 : e1.getEmpno() < e2.getEmpno() ? 1 : 0;
	}
	
}

class EmpLocal{
	private Integer  empno;
	private String word;
	public EmpLocal() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EmpLocal(Integer empno, String word) {
		super();
		this.empno = empno;
		this.word = word;
	}



	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
}

