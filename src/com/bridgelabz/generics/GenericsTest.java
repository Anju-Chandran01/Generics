package com.bridgelabz.generics;

public class GenericsTest <T extends Comparable<T>> {
    private T a,b,c,d;

    //constructor with generic
    GenericsTest(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c= c;
    }

    GenericsTest(T a, T b, T c, T d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static <T extends Comparable<T>> T findMaximum(T ...values) {
        T max = values[0];
        for (T element : values) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        printMax(max,values);
        return max;
    }

    private static <T extends Comparable<T>>  void printMax(T max, T ...values) {
        System.out.println("Maximum of ");
        for(T t : values) {
            System.out.print(t+" ");
        }
        System.out.println("is " + max);
    }
}