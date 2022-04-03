package com.bridgelabz.generics;

public class Generics {
    public static void main(String[] args) {


        //String
        String a1 = "Apple", b1 = "Peach", c1 = "Banana";
        GenericsTest<String> test1 = new GenericsTest<>(a1, b1, c1);
        test1.findMaximum(a1, b1, c1);

        //Integer
        Integer a2 = 30, b2 = 50, c2 = 40;
        GenericsTest<Integer> test2 = new GenericsTest<>(a2, b2, c2);
        test2.findMaximum(a2, b2, c2);

        //Float
        Float a3 = 10.5f, b3 = 12.7f, c3 = 17.7f;
        GenericsTest<Float> test3 = new GenericsTest<>(a3, b3, c3);
        test3.findMaximum(a3, b3, c3);

        Integer a4 = 25, b4 = 40, c4 = 65, d4 = 75;
        GenericsTest<Integer> test4 = new GenericsTest<>(a4, b4, c4, d4);
        test4.findMaximum(a4, b4, c4, d4);
    }
}
