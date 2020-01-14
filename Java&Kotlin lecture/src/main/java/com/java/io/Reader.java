package com.java.io;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try {
            InputStream stream = new FileInputStream(file);

            int n = stream.read();
            while (n != -1) {
                System.out.println((char)n);
                n = stream.read();
            }

            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }

        try {
            FileReader fileReader = new FileReader("kotlin_wiki.txt");
            int n = fileReader.read();
            while (n != -1) {
                System.out.print((char)n);
                n = fileReader.read();
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("kotlin_wiki.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
