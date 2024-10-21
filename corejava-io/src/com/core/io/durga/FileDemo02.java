package com.core.io.durga;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileDemo02 {

	public static void main(String[] args) throws Exception{
		File fileD = new File("abc");
		fileD.mkdir();
		File fileF = new File(fileD,"test1.txt");
		fileF.createNewFile();

		File file = new File("d:\\aaa","test2.txt");//Assuming aaa folder present in d drive
		file.createNewFile();
		
		List<String > listArray = new ArrayList();
		List<String> list = new LinkedList();
		
	}

}
