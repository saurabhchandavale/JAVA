package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeAllFiles {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		File f = new File("C:\\Work_DSI\\MyJava\\Workspace\\FileHandling\\Ne");
		String[] list = f.list();
		for(String s  : list) {
			File file = new File(f,s);
			//System.out.println(file);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String readLine = br.readLine();
			System.out.println(readLine);
			while(readLine != null) {
				pw.println(readLine);
				readLine = br.readLine();
			}
			
			
		}
		
		pw.flush();
		
		
	}

}
