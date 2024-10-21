package MyScjpDumpthread;

public class Thead2 implements Runnable{
		
	
public static void main(String[] args) throws Exception{
	Thread t=new Thread(new Thead2());
	
	//Thread t2=new Thread(new Thead2());
	//t2.run();
	//t2.run();
	t.start();
	System.out.println("end of the thread");
	t.join();
	System.out.println("2nd of the thread");
} 
@Override
public void run() {
	for (int i = 0; i <4; i++) {
		System.out.println(i);
	}
}
}
