package com.java.collections.scjp;

import java.util.ArrayList;

class Business{ }
class Hotal extends Business{}
	class Inn extends Hotal{ }
 class Travel {
	ArrayList<Hotal> go(){
		//return new ArrayList<Inn>();
		return new ArrayList<Hotal>();
		//return new ArrayList<Object>();
		//return new ArrayList<Business>();
	}
}

public class Selftest14 {
public static void main(String[] args) {
	
}
}
