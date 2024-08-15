package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffredReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("newFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String readLine = br.readLine();
		while(readLine != null) {
			System.out.println(readLine);
			readLine  = br.readLine();
		}
		
	}

}
