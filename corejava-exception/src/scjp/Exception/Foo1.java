package scjp.Exception;

public class Foo1 {
	static float f;
	public static void parse(String str) {
		 try {
		  f = Float.parseFloat(str);
		  //System.out.println("rr");
		 } catch (NumberFormatException nfe) {
			 System.out.println("dd"+nfe);
			// nfe.printStackTrace();
			 
			 //f =0;
	 } finally {
		 System.out.println(f);
		 }
		 }
		
public static void main(String[] args) {
	parse("invilad");
}
}
