package com.bridgelabz.generics;

public class Generics {
    public static void main(String[] args) {

        Integer a1 = 30, b1 = 10, c1 = 20;
        new GenericsTest(a1, b1, c1);
        GenericsTest.maximum();

        Integer a2 = 30, b2 = 50, c2 = 20;
        new GenericsTest(a2, b2, c2);
        GenericsTest.maximum();

        Integer a3 = 30, b3 = 10, c3 = 40;
        new GenericsTest(a3, b3, c3);
        GenericsTest.maximum();

    }
}
