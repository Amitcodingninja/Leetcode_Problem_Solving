package JavaDSACourse.Array.Sorting;

import java.util.Arrays;

/*
Merge Sort: A divide-and-conquer algorithm that splits the array into halves, recursively sorts each half, and then merges them back together in sorted order.

Steps:
1. Divide: Split the array into two halves until each subarray has only one element.
2. Conquer: Recursively sort each half.
3. Merge: Combine the sorted halves to form a single sorted array.

Example:
Array: `[38, 27, 43, 3, 9]`

1. Split: `[38, 27]`, `[43, 3, 9]` → further split until single elements.
2. Merge: `[27, 38]` and `[3, 9, 43]` → `[3, 9, 27, 38, 43]`

Complexity: O(n log n)
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        // Sort the array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the first half
            mergeSort(arr, left, mid);

            // Sort the second half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function to combine sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

