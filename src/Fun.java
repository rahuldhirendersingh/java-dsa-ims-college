import java.util.Arrays;

public class Fun {
    static String name = "Mark";
    public static void main(String[] args) {
        int[] arr = {89, 77, 67, 93, 11, 17};

        String name = "Max";
//        int max = maxNum(arr);
//        System.out.println(max);
//
//        System.out.println(name);

        int result = addition(25, 78, 90, 73, 28);
        System.out.println(result);
    }

    static int addition(int ...numbers  ) {
        int total = 0;

        for (int num : numbers) {
            total = total + num;
        }

        return total;
    }



    static int maxNum(int[] arr) {
        System.out.println(name);
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
