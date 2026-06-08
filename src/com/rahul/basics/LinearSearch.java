package com.rahul.basics;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // find the target element in the array.
        // return the index of it if found, otherwise -1.

        System.out.print("How many element do you want in array? ");
        int arrElementCount = scanner.nextInt();
        int[] arr = new int[arrElementCount];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element here: ");
            int element = scanner.nextInt();
            arr[i] = element;
        }

        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        int result = linearSearch(arr, target);

        System.out.println(Arrays.toString(arr));

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
