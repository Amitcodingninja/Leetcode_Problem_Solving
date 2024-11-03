package JavaDSACourse.Array.Sorting;

import java.util.Arrays;

/*
Selection Sort: In this algorithm, we repeatedly find the smallest (or largest) element from the unsorted portion and move it to the sorted portion at the beginning of the array.
 Steps:
        1. Find the minimum element in the unsorted part.
        2. Swap it with the first unsorted element.
        3. Move to the next position and repeat until the array is sorted.

        Example:
Array: `[64, 25, 12, 22, 11]`
        1. Find 11, swap with 64 → `[11, 25, 12, 22, 64]`
        2. Find 12, swap with 25 → `[11, 12, 25, 22, 64]`
        3. Repeat until sorted → `[11, 12, 22, 25, 64]`

        Complexity: O(n²)

 */
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        String[] arr1 = {"Love", "Amit", "Pooja"};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSortforString(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    public static void selectionSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void selectionSortforString(String[] arr) {
        String temp;

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

}
