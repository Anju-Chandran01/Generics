package com.bridgelabz.generics;

public class Generics {
    public static void main(String[] args) {

        String a1 = "Apple",b1 = "Peach",c1 = "Banana";
        GenericsTest test1 = new GenericsTest(a1,b1,c1);
        test1.maximum();

        String a2 = "One",b2 = "Two",c2 = "Three";
        GenericsTest test2 = new GenericsTest(a2,b2,c2);
        test2.maximum();

        String a3 = "Red",b3 = "Blue",c3 = "Green";
        GenericsTest test3 = new GenericsTest(a3,b3,c3);
        test3.maximum();

    }
}
