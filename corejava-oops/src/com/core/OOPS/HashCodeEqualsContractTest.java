package com.core.OOPS;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsContractTest {
	public static void main(String[] args) {
		Map<EmployeeKey, String > empDetails = loadEmpCache();
		
		EmployeeKey cacheLookUp = new EmployeeKey("002","23345555");
		
		System.out.println(empDetails.get(cacheLookUp));
		
		
	}
	
	public static Map<EmployeeKey, String> loadEmpCache(){
		EmployeeKey empKey1 = new EmployeeKey("001","12231111");
		EmployeeKey empKey2 = new EmployeeKey("002","23345555");
		EmployeeKey empKey3 = new EmployeeKey("003","34467654");
		
		Map<EmployeeKey, String> cache = new HashMap();
		cache.put(empKey1, "Bob");
		cache.put(empKey2, "Ray");
		cache.put(empKey3, "Ice");
		
		return cache;
	}
	
}

class EmployeeKey{
	private String empId;
	private String dob;
	
	public EmployeeKey(String empId, String dob) {
		this.empId = empId;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}
}

