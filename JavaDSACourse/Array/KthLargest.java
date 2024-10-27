package JavaDSACourse.Array;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println(findKthLargest(arr, k));
        System.out.println(findKthLargest1(arr,k));
    }
    public static int findKthLargest1(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];

    }

    public static int findKthLargest(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr[arr.length - k];


    }
}

