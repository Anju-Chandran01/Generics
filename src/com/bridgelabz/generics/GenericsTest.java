package com.bridgelabz.generics;

//class with generic
public class GenericsTest <T extends Comparable<T>> {

    private T a, b, c;

    //constructor with generic
    GenericsTest(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @method to get maximum
     */
    public void maximum() {
        T res = GenericsTest.findMaximum(a, b, c);
        System.out.println("Maximum of " + a + ", " + b + " and " + c + " is: " + res);
    }

    /**
     * @param <T>
     * @param a
     * @param b
     * @param c
     * @return max element
     */
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}