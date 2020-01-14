package com.java.many;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(5);
        list.add(true);
        list.add("ABC");
        System.out.println(list);

        int i = (int)list.get(0);
        String s = (String)list.get(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        System.out.println(list2.size());

        java.util.List<Integer> scores = Arrays.asList(1, 2, 3, 4, 5, 6);
        for(int score: scores) {
            System.out.println(score);
        }
    }
}
