package com.java.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    static int PASS = 60;

    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void showScore() {
        int average = getAverage();
        System.out.println(name + "\tEnglish:" + english + "\tMath:" + math);
        System.out.print(average > PASS ? "PASS" : "FAILED");

        char grading = 'F';

//        if(average >=90 && average <= 100){
//            grading = 'A';
//        } else if (average >=80 && average <= 89) {
//            grading = 'B';
//        } else if (average >=70 && average <= 79) {
//            grading = 'C';
//        } else if (average >=60 && average <= 69) {
//            grading = 'D';
//        } else {
//            grading = 'E';
//        }

        switch (average / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'E';
                break;
        }

        System.out.println("\t" + grading);
    }

    public void checkName() {
        System.out.println(name.length());
    }

    public int getHighest() {
        if(english >= math) {
            System.out.print("English ");
            return english;
        }else {
            System.out.print("Math ");
            return math;
        }
    }

    public int getAverage() {
        return (english + math) / 2;
    }
}
