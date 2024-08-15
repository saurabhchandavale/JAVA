package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter11{

    public static void main(String[] args) {
        // Define the file path
        String filePath = "newFile.txt";

        // Use try-with-resources to ensure resources are closed properly
        try (FileWriter fw = new FileWriter(filePath);
             BufferedWriter bw = new BufferedWriter(fw)) {

            // Write some content to the file
            bw.write("Hello, world!");
            bw.newLine(); // Adds a newline to the file
            bw.write("This is a second line.");

            // Optionally, you can flush the buffer to ensure all data is written
            bw.flush();

        } catch (IOException e) {
            // Handle potential IOException
            e.printStackTrace();
        }
    }

}
