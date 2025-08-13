package com.java.core.concepts;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class SystemOutPrintln {

	public static void main(String[] args) {
		System.out.println("Test");
		Display.show.println();
	}

}
final class Display{
	public static Show show = new Show();
}

class Show{
	public void println() {
		
	}
	
}