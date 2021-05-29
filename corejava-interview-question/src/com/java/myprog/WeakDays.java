package com.java.myprog;

public class WeakDays {
public static void main(String[] args) {
	int i=3;
	/*if (i==1) {
		System.out.println("sunday");
	}else if(i==2){System.out.println("monday");
	}else{
		System.out.println("nt a weak");
	}*/
	
	switch(i) {
	case 1:System.out.println("sunday");
	break;
	case 2:System.out.println("mon");
	break;
	case 3:System.out.println("tue");
	break;
	case 4:System.out.println("wes");
	break;
	case 5:System.out.println("thus");
	break;
	case 6:System.out.println("fri");
		
		break;

	default:System.out.println("nt in weak");
		break;
	}
}
}
