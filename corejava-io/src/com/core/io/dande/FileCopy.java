package com.jlc.io;

import java.io.IOException;
import java.nio.file.*;

public class FileCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Path src = Paths.get("C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/Sunset.jpg");
	
		Path tgt = Paths.get("C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/Sunset2.jpg");

		Files.copy(src, tgt, StandardCopyOption.REPLACE_EXISTING);
		
		Path toDel = Paths.get("C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/Sunset2.jpg");
		Files.delete(toDel);
	}

}
