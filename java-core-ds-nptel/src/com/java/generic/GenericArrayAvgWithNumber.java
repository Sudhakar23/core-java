package com.java.generic;
//Note:-
//Upper bond of argument
//When specifying a type parameter, you can create an upper bond that declares the super class
//from which all type arguments must be derived. 
//T can only be replaced by super class, or subclass of the superclass.
//This is inclusive upper limit. 
class GenericArray<T extends Number>{
	T array[];
	GenericArray(T t[]){
		this.array = t;
	}
	public void getAverage() {
		double total = 0.0;
		for(int i = 0; i<array.length;i++) {
			total = total + array[i].doubleValue();
		}
		System.out.println(total);
	}
}
public class GenericArrayAvgWithNumber {
	public static void main(String[] args) {
		GenericArray<Double> ga = new GenericArray<Double>(new Double[] {1.1d,2.2d,3.3d,4.4d});
		GenericArray<Integer> gaI = new GenericArray<Integer>(new Integer[] {1,2,3,4});
		GenericArray<Float> gaF = new GenericArray<Float>(new Float[] {1.1F,2.2F,3.3F,4.4F});
		
		ga.getAverage();
		gaI.getAverage();
		gaF.getAverage();
	}
}