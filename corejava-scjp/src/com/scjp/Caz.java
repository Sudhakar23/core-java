package com.scjp;

class Bye{
	static{	System.out.println("SB in Bye");	}
	{System.out.println("IB in Bye");	}
	Bye(){System.out.println("Const in Bye");}
}
class Hello extends Bye{
	static{	System.out.println("SB in Hello");	}
	{System.out.println("IB in Hello");	}
	Hello(){System.out.println("Const in Hello");}
	
}
class Hai extends Hello{
	{	System.out.println("IB in Hai");	}
	static{		System.out.println("SB in Hai");	}
	Hai(){		System.out.println("Cosnt in Hai");	}
}
public class Caz extends Hai{
	public static void main(String[] args) {
		Hai h = new Hai();
	}
}