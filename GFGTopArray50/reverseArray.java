package GFGTopArray50;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
//        reverseArray(arr);
//        // 2nd way of reverse
//        reverseArray1(arr);
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

        // 3rd Way by collection
//        List<int[]> list = Arrays.asList(arr);
//        Collections.reverse(list);
//        System.out.println(Arrays.toString(arr));

        // Using Stream

        int[] reversed = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
        System.out.println(Arrays.toString(reversed));


    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray1(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }


}
