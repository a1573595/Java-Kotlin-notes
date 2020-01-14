package com.java.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student's name:");
        String name = scanner.next();

        System.out.println("Please enter student's English score:");
        int english = scanner.nextInt();

        System.out.println("Please enter student's Math score:");
        int math = scanner.nextInt();

        Student.PASS = 50;
        com.kotlin.student.Student.Companion.getPASS();
        com.kotlin.student.Student.getPASS();   // 有加@JvmStatic註解
        Student student = new Student("01", name, english, math);
        student.showScore();
        student.checkName();
        System.out.println("High score: " + student.getHighest());
        System.out.println("Average score: " + student.getAverage());

        System.out.println("");
        GraduatedStudent gStudent = new GraduatedStudent("100", "Mary", 80, 52, 78);
        gStudent.showScore();
        gStudent.checkName();
        System.out.println("High score: " + gStudent.getHighest());
        System.out.println("Average score: " + gStudent.getAverage());
    }
}
