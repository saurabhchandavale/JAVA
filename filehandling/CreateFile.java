package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f = new File("c.txt");
		//System.out.println(f.exists());
		//f.createNewFile();
	//	System.out.println(f.exists());
		f.mkdir();
		System.out.println("----");
		
		
		File a = new File("new");
		a.mkdir();
		File b = new File("new", "newFile.txt");
		b.createNewFile();
		File c = new File( "C:\\Users\\SCE32\\Videos\\Captures", "newFile2.txt");
		c.createNewFile();
		
		
	}

}
