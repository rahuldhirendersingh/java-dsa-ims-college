package com.rahul.basics;

import java.util.Scanner;

public class IterativeStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // loops ??

        // Q. print "Hello World" 10 times.

//        int i = 10;
//
//        while (i >= 1) {
//            System.out.println("Hello World " + i);
//            i--;
//        }

        // Q. print a to b.

//        System.out.print("Enter the start? ");
//        int a = scanner.nextInt();
//        System.out.print("Enter the end? ");
//        int b = scanner.nextInt();
//
//        if (a == b) {
//            System.out.println("Start & End are Equal, So no number to print");
//        } else {
//            boolean isAsc = a < b;
//
//            if (isAsc) {
//                while (a <= b) {
//                    System.out.println(a);
//                    a++;
//                }
//            } else {
//                while (a >= b) {
//                    System.out.println(a);
//                    a--;
//                }
//            }
//        }


        // print the table of a number given by user?

//        System.out.print("Please enter a number?");
//        int number = scanner.nextInt();
//
//        int i = 1;
//
//        while (i <= 10) {
//            System.out.println(number * i);
//            i++;
//        }


        // for loops

        // print 1 to 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }


        // print the table of a number?
//        System.out.print("Enter the number you want the table of? ");
//        int number = scanner.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number * i);
//        }


        // print the sum of all the even no between 1 to 100
//        int total = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                total += i;
//            }
//        }
//        System.out.println("Total: " + total);

        // do while

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//            continue;
//        } while (i <= 10);


        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5 || i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
