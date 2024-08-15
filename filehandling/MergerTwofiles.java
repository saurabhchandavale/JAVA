package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergerTwofiles {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("merge1.txt");
		BufferedReader bw = new BufferedReader(new FileReader("newFile.txt"));
		String readLine = bw.readLine();
		BufferedReader bw1 = new BufferedReader(new FileReader("print.txt"));
		String readLine1 = bw1.readLine();
	/*	while(readLine != null) {
			pw.println(readLine);
			readLine = bw.readLine();
		}
		
		
		while(readLine1 != null) {
			pw.println(readLine1);
			readLine1 = bw1.readLine();
		}*/
		
		while(readLine != null || readLine1 != null) {
			if(readLine != null) {
				pw.println(readLine);
				readLine = bw.readLine();
			}
			if(readLine1 != null) {
				pw.println(readLine1);
				readLine1 = bw1.readLine();
			}
		}
		pw.flush();
		pw.close();
	}

}
