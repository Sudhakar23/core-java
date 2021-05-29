package test;

public class CloneTest implements Cloneable {
 void CloneTest(){
	 CloneTest ct = null;
	 try {
		ct =(CloneTest)this.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }	

}

