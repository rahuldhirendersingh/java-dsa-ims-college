package com.rahul.basics;

public class Functions {
    public static void main(String[] args) {
//        greetings("Mark");
//        greetings("Peter");
//        greetings("Max");
//        System.out.println(addition(12, 8));

//        int result = addition(12, 8);
//        System.out.println(result);

        String fullName = fullName("Verstappen", "Max");
        System.out.println(fullName);
    }

    static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
//        System.out.println("This code will never run");
    }

    static int addition(int a, int b) {
        return a + b;
    }

    // defining a function
    static void greetings(String name) {
        System.out.println("Hello " + name);
        System.out.println("How are you doing");
    }


}
