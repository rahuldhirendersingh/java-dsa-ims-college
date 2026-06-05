import java.util.Arrays;
import java.util.Scanner;

public class LearningArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arrays are store a collection of element of similar type inside a single variable.

        // store rnos of 5 students
        int[] rnos = {15, 19, 88, 11};

//        for (int i = 0; i < rnos.length; i++) {
//            System.out.print(rnos[i] + " ");
//        }

        // enhanced for loop
//        for (int rno : rnos) {
//            System.out.print(rno + " ");
//        }

//        System.out.println(Arrays.toString(rnos));

//        String[] names = {"Mark", "Jon", "Peter", "Steve"};
//
//        for (String name : names) {
//            System.out.print(name + " ");
//        }

        String[] names = new String[5];
        int[] numbers = new int[10];

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("Enter a number to store at index: " + i);
//            int input = scanner.nextInt();
//            numbers[i] = input;
//        }
//
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }

//        for (int i = 0; i < names.length; i++) {
//            System.out.print("Enter a new name: ");
//            String name = scanner.nextLine();
//            names[i] = name;
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }


        //Q. find the largest in the array?
        int[] arr = {12, 78, 7, 99, 33, 47};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);




    }
}
