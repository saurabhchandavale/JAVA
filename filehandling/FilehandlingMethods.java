package com.filehandling;

import java.io.File;

public class FilehandlingMethods {

	public static void main(String[] args) {
		File c = new File( "C:\\Users\\SCE32\\Videos\\Captures");
		String[] list = c.list();
		int count = 1;
		for(String l : list) {
			File f = new File(c,l);
			if(f.isFile()) {
			System.out.println(f + " " + count++);
			}
		}

		
	}

}
