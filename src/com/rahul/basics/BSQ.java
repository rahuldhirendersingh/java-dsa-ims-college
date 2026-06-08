package com.rahul.basics;

import java.util.Scanner;

public class BSQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {19, 27, 33, 74, 87};

        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        int result = floor(arr, target);

        if (result == -1) {
            System.out.println("No floor as target is smaller than first element");
        } else {
            System.out.println(result);
        }
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return arr[start];
    }


    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return arr[end];
    }
}

