package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class McDonalds {
    HashMap<String, Item> menu = new HashMap<>();

    public McDonalds() {
        File file = new File("mcdonalds.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                Item item = new Item(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
                menu.put(item.getId(), item);

                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("讀取失敗！！！");
        }
    }

    public void print() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
//            System.out.println(itemEntry.getKey() + "\t" + itemEntry.getValue().getName());
            System.out.println(itemEntry.getValue().toString());
        }
    }

    public static void main(String[] args) {
        McDonalds mcDonalds = new McDonalds();
        mcDonalds.print();
    }
}

class Item {
    private String id;
    private String name;
    private int calorie;
    private int price;

    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + calorie + "\t" + price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
