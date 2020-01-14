package com.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Http {
    public static void main(String[] args) {
        try {
//            URL url = new URL("https://api.myjson.com/bins/dlvgh");
            URL url = new URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream stream = connection.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String line = reader.readLine();
            StringBuffer buffer = new StringBuffer();
            while (line != null) {
                buffer.append(line);
//                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
            System.out.println(buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
