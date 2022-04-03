package com.bridgelabz.generics;

class GenericsTest {

    private static Float a,b,c;

    GenericsTest(Float a, Float b, Float c){
        GenericsTest.a = a;
        GenericsTest.b = b;
        GenericsTest.c = c;
    }

    public void maximum() {
        Float res=GenericsTest.findMaximum(a,b,c);
        System.out.println("Maximum of "+a+", "+b+" and "+c+" is: " +res);
    }

    public static Float findMaximum(Float a, Float b, Float c) {
        Float max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}