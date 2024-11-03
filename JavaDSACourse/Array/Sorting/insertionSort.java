package JavaDSACourse.Array.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/*Insertion Sort: This algorithm sorts by taking each element and placing it in its correct position
in the sorted portion of the array.

 Steps:
 1. Start from the second element.
 2. Compare it to elements on its left, shifting them right until you find the correct spot.
 3. Insert the element and move to the next one.
 4. Repeat until sorted.

 Example:
 Array: `[12, 11, 13, 5, 6]`

 1. Insert 11 before 12 → `[11, 12, 13, 5, 6]`
 2. 13 is in the correct spot → `[11, 12, 13, 5, 6]`
 3. Insert 5 at the start → `[5, 11, 12, 13, 6]`
 4. Insert 6 after 5 → `[5, 6, 11, 12, 13]`

 Complexity: O(n²)
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int temp;
        int j;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }

    }
}
