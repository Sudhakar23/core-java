package com.core.io.durga;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) {

		File file = new File("text1");
		System.out.println(file.exists());
		if (!file.exists()) {
			try {
				file.mkdir();
				file.createNewFile();
				System.out.println("New file created.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
