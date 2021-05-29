package MyScjpDumpthread;

public class TestSeven extends Thread{
	private static int x;
	public synchronized  void doThing(){
		 int current=x;
		 current++;
		 x=current;
		 System.out.println(current);
	}
	@Override
		public void run() {
			doThing();
		}
public static void main(String[] args) {
	 TestSeven t=new  TestSeven();
	 t.start();
}
}
