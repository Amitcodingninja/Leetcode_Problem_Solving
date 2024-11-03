package JavaDSACourse.Array.Sorting;

import java.util.Arrays;

public class mergeSort2 {

    // Recursive function to divide the array into subarrays
    public static void divide(int[] arr, int si, int ei) {
        // Base case: if the start index is greater than or equal to the end index, return
        if (si >= ei) {
            return;
        }

        // Calculate the middle index
        int mid = si + (ei - si) / 2;

        // Recursively divide the first half
        divide(arr, si, mid);

        // Recursively divide the second half
        divide(arr, mid + 1, ei);

        // Merge the sorted halves
        conquer(arr, si, mid, ei);
    }

    // Function to merge two sorted halves of the array
    public static void conquer(int[] arr, int si, int mid, int ei) {
        // Temporary array to hold the merged elements
        int merged[] = new int[ei - si + 1];

        // Pointers for the left and right subarrays
        int idx1 = si;      // Starting index for the left half
        int idx2 = mid + 1; // Starting index for the right half
        int x = 0;          // Index for the merged array

        // Merge elements in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from the right half, if any
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged elements back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        // Test array
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        // Print original array
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        // Call divide function to sort the array
        divide(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
