package com.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Kotlin");
            file.mkdir();

            FileWriter writer = new FileWriter("D:\\Kotlin\\output.txt");
            writer.write("ABC");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
