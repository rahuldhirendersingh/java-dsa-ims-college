import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr1 = {13, 19, 11, 22};
        int[] arr2 = arr1;

        arr1[0] = 5;



//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
