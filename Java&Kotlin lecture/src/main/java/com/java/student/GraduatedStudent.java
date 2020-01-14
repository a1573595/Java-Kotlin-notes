package com.java.student;

public class GraduatedStudent extends Student{
    int thesis;
    static int PASS = 70;

    public GraduatedStudent(String id, String name, int english, int math, int thesis) {
        super(id, name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void showScore() {
        int average = getAverage();
        System.out.println(name + "\tEnglish:" + english + "\tMath:" + math + "\tThesis:" + thesis);
        System.out.print(average > PASS ? "PASS" : "FAILED");

        char grading = 'F';

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

    @Override
    public int getHighest() {
        if(english >= math && english >= thesis) {
            System.out.print("English ");
            return english;
        }else if(math >= english && math >= thesis) {
            System.out.print("Math ");
            return math;
        } else {
            return thesis;
        }
    }

    @Override
    public int getAverage() {
        return (english + math + thesis) / 3;
    }
}
