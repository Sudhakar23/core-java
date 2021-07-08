package com.jlc.io;

import java.io.*;

public class Lab6 {
	public static void main(String[] args) throws IOException {
		System.out.println("File Seperator \t : " + File.pathSeparator);
		System.out.println("File Path Seperatior \t : "
				+ File.pathSeparatorChar);
		System.out.println("File sepertor\t: " + File.separator);
		System.out.println("File separatorChar\t : " + File.separatorChar);

		File[] far = File.listRoots();
		System.out.println(far.length);
		System.out
				.println("FileName\tis Directory\tisFile\tisAbsoulute\tgetPath");
		for (int i = 0; i < far.length; i++) {
			System.out.println(far[i].getName() + "\t\t" + far[i].isDirectory()
					+ "\t\t" + far[i].isAbsolute() + "\t\t" + far[i].getPath());
		}
		File f1 = new File(far[0], "hi.txt");
		f1.createNewFile();
		System.out.println(" ");
		File f2 = new File("sri");
		f2.mkdir();
		System.out.println("Dir sri is created");
		File f3 = new File(f2, "jlc\\io");
		f3.mkdirs();
		System.out
				.println("directory io inside jlc, and jlc inside sri is created");
		File f4 = new File(f3, "hai.txt");
		System.out.println("f4.getName()\t:" + f4.getName());
		System.out.println("before creating f4.exist()\t:" + f4.exists());
		f4.createNewFile();
		System.out.println("File hai.txt is created sri\\jlc\\io");

		System.out.println("f4.getAbsolutepath()\t:" + f4.getAbsolutePath());
		System.out.println("f4.getCanonicalPath()\t:" + f4.getCanonicalPath());
		System.out.println("f4.getPatent()\t:" + f4.getParent());
		System.out.println("f4.getPath()\t:" + f4.getPath());
		System.out.println("after createin f4.exists()\t:" + f4.exists());
		System.out.println("f4.canRead()\t:" + f4.canRead());
		System.out.println("f4.canWrite()\t:" + f4.canWrite());
		f4.setReadOnly();
		System.out.println("setted read only");
		System.out.println("f4.canRead()\t" + f4.canRead());
		System.out.println("f4.canWrite()\t" + f4.canWrite());

		File f5 = new File("Hello.txt");
		f5.createNewFile();
		System.out.println("f5.getAbsolutepath()\t:" + f5.getAbsolutePath());
		System.out.println("f5.getCanonicalPath()\t:" + f5.getCanonicalPath());
		System.out.println("f5.getPatent()\t:" + f5.getParent());
		System.out.println("f5.getPath()\t:" + f5.getPath());

		File f6 = new File(f2, "Hai1.txt");
		f6.createNewFile();
		File f7 = new File(f2, "Hai2.txt");
		f7.createNewFile();
		File f8 = new File(f2, "Hai3.txt");
		f8.createNewFile();
		File f9 = new File(f2, "Hai4.txt");
		f9.createNewFile();
		File f10 = new File(f2, "Hai5.txt");
		f10.createNewFile();

		String fileNameList[] = f2.list();
		System.out.println("**** list of filename as String array ****");
		for (int j = 0; j < fileNameList.length; j++) {
			System.out.println(fileNameList[j] + ",");
		}
		System.out.println();
		System.out.println("**** List of files as File array ****");
		File[] fileList = f2.listFiles();
		for (int j = 0; j < fileList.length; j++) {
			System.out.println("File name\t: " + fileList[j].getName()
					+ ", isDirectory\t:" + fileList[j].isDirectory()
					+ ",isFile\t:" + fileList[j].isFile());
		}
		System.out.println();

	}

}
