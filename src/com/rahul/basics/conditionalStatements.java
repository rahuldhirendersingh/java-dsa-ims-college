package com.rahul.basics;

import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        // print if a user can vote or not based on his/her age?

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age? ");
//        int age = scanner.nextInt();
//
//        if (age >= 18) {
//            System.out.println("Person can vote");
//        } else {
//            System.out.println("Person cannot vote");
//        }

//        System.out.print("What is the temperature outside? ");
//        float temperature = scanner.nextFloat();
//
//        if (temperature < 20) {
//            System.out.println("Weather is cold outside");
//        } else {
//            System.out.println("Weather is warm outside");
//        }


        // print students grade based on their marks?

//        System.out.print("Enter your marks? ");
//        float marks = scanner.nextFloat();

//        if (marks >= 90) {
//            System.out.println("A");
//        } else if (marks >= 80) {
//            System.out.println("B");
//        } else if (marks >= 70) {
//            System.out.println("C");
//        } else if (marks >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }



        // ternary operators
        float marks = 43.8F;
        String result = (marks >= 50) ? "Pass" : "Fail";

        System.out.println(result);

    }


}
