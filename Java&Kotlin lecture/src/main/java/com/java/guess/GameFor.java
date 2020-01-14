package com.java.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Please enter a number("+ i + "/" + 5 + "):");
            number = scanner.nextInt();

            if(number > secret) {
                System.out.println("Lower");
            } else if(number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Bingo, number is " + number);
                break;
            }
        }

        System.out.println("The end");
    }
}
