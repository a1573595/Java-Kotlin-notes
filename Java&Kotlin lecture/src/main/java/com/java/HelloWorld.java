package com.java;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");

        new Person(1.75f, 68).sayHello();

        Person p = new Person("Peter", 1.75f, 68);
        p.sayHello();
        p.height = 1.75f;
        p.weight = 68;
        System.out.println(p.getBMI());

        // Data type 基本資料型態
        boolean isReal = true; // 1bytes

        byte r = 0;    // 1bytes
        short x = 1;    // 1bytes
        int y = 2;   // 4bytes
        long z = 3; // 8bytes

        float a = 1.0f;   // 4bytes
        double b = 1.0;  // 8bytes

        char c = 'A';   // 4bytes
        // Reference data type 參照資料型態
        Boolean isReal2 = false;

        Byte r2 = 0;
        Short x2 = 1;
        Integer y2 = 1;
        Long z2 = 3L;

        Float a2 = 1.0f;
        Double b2 = 1.0;

        Character c2 = 'A';
        String str = "ABC";

        int source = 88;
        System.out.println(source >= 60);

        System.out.println(c2 > 60);

        String s = "ABCDE";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(3));
    }
}
