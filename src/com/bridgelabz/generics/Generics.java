package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num:");
        Integer x = sc.nextInt();
        System.out.print("Enter 2nd num:");
        Integer y = sc.nextInt();
        System.out.print("Enter 3rd num:");
        Integer z = sc.nextInt();

        Integer max;
        if (x.compareTo(y) > 0) {
            max = x;
        } else {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        System.out.println("Max number is " + max);
    }
}
