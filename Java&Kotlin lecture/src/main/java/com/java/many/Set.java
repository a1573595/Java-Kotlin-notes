package com.java.many;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(8);
        hashSet.add(3);

        System.out.println(hashSet);

        for(int number : hashSet) {
            System.out.println(number);
        }
    }
}
