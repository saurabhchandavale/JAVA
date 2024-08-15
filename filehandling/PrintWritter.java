package com.filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWritter {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("print.txt");
		pw.println(1000);
		pw.println('c');
		pw.println("Print Writer example ");
		pw.println("Need not to write line seperator");
		pw.flush();
		pw.close();
	}

}
