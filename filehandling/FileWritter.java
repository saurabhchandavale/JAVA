package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {

	public static void main(String[] args) throws IOException {
		
		/*FileWriter f = new FileWriter("newFile.txt",true);
		f.write(100);
		f.write("durga");
		f.write("\n");
		f.write("This is example of file Writier\n");
		 char c[] = {'a','b'};
		 f.write(c+"\n");
		 f.write(c+"\n");
		 f.write(c);
		 f.flush();
		 f.close();*/
	/*	FileReader f =new FileReader("newFile.txt");
		int i = f.read();
		while(i!=-1)
		{
			char c = (char) i;
			System.out.print(c);
			i = f.read();
		}
		f.close();*/
		File file = new File("newFile.txt");
		FileReader f =new FileReader(file);
		char[] ch  = new char[(int) file.length()];
		f.read(ch);
		f.close();
		for(char c : ch) {
			System.out.print(c);
		}
		f.close();
				
		
	}

}
