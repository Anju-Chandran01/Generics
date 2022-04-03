package com.bridgelabz.generics;

class GenericsTest {

    private static Integer a,b,c;

    GenericsTest(Integer a, Integer b, Integer c){
        GenericsTest.a = a;
        GenericsTest.b = b;
        GenericsTest.c = c;
    }

    public static void maximum() {
        Integer max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum between "+ a+ ", "+b+", "+c +" is "+ max);
    }
}