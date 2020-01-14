package com.java.many;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(0, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(5, "D");
        hashMap.put(2, "E");

        System.out.println(hashMap);

        for(int key: hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }
}
