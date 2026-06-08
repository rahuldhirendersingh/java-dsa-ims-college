package com.rahul.basics;

public class FunOverloading {
    public static void main(String[] args) {
        System.out.println(add("Lewis", "Hamilton"));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }

}
