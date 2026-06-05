import java.util.Scanner;

public class MultiDimentionalArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 D
//        String[] names = {"mark", "max", "peter"};

        // 2 D

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6, 11},
//                {7, 8}
//        };

//        System.out.println(arr[1][0]);

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] nums = new int[3][3];
        // input

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print("Enter a element: ");
//                int element = scanner.nextInt();
//                nums[i][j] = element;
//            }
//            System.out.println();
//        }
//
//        // output
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 3 D
//        char[][][] letters = {
//                {
//                        {'a', 'b'},
//                        {'c', 'd'}
//                },
//                {
//                        {'e', 'f'},
//                        {'g', 'h'}
//                }
//        };

//        for (int i = 0; i < letters.length; i++) {
//            for (int j = 0; j < letters[i].length; j++) {
//                for (int k = 0; k < letters[i][j].length; k++) {
//                    System.out.print(letters[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        char[][][] letters = new char[2][2][2];

//        for (int i = 0; i < letters.length; i++) {
//            for (int j = 0; j < letters[i].length; j++) {
//                for (int k = 0; k < letters[i][j].length; k++) {
//                    letters[i][j][k] = scanner.next().charAt(0);
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < letters.length; i++) {
//            for (int j = 0; j < letters[i].length; j++) {
//                for (int k = 0; k < letters[i][j].length; k++) {
//                    System.out.print(letters[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


        int[][] arr = {
                {88, 91, 17},
                {13, 18, 11},
                {93, 57, 41}
        };

        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    countOdd++;
                }
            }
        }

        System.out.println("There are " + countOdd + " Odd nos in array");

    }

}
