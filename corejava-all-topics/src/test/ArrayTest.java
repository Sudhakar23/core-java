package test;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6,7,8,9}};
		for(int a[]:arr){
			System.out.println(a);
				for(int b:a){
				System.out.println(b);
			}
		}
	}

}
