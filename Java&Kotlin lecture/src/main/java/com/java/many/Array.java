package com.java.many;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[4] = 5;

        int[] scores = {66, 77, 88, 99, 50};
        System.out.println(scores);

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for(int score : scores) {
            System.out.println(score);
        }
    }
}
