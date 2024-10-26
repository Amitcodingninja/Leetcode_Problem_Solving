package JavaDSACourse.Array;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 5};

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] + " is largest number");
        max(arr);
    }

    public static void max(int[] arr) {
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }
        }
        System.out.println("Largest Element " + num);
    }
}
