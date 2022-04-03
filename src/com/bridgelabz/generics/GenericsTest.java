package com.bridgelabz.generics;

class GenericsTest {


    private static String a,b,c;

    GenericsTest(String a, String b, String c){
        this.a = a;
        this.b = b;
        this.c= c;
    }

    public void maximum() {
        String res=GenericsTest.findMaximum(a,b,c);
        System.out.println("Maximum of "+a+", "+b+" and "+c+" is: " +res);
    }

    public static String findMaximum(String a, String b, String c) {
        String max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}