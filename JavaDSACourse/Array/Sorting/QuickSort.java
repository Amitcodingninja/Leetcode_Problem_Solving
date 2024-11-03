package JavaDSACourse.Array.Sorting;

import java.util.Arrays;

/*
Quick Sort: A divide-and-conquer sorting algorithm that selects a "pivot" element and partitions the array around it, so elements less than the pivot come before it, and elements greater come after it.

Steps:
1. Choose a Pivot: Select an element as the pivot (commonly the last element).
2. Partition: Rearrange the array so elements less than the pivot are on its left, and elements greater are on its right.
3. Recursively Sort: Apply the same steps to the subarrays on the left and right of the pivot.

Example:
Array: `[10, 7, 8, 9, 1, 5]`
1. Choose pivot `5`, rearrange to `[1, 5, 8, 9, 10, 7]`.
2. Repeat for subarrays `[1]` and `[8, 9, 10, 7]` until sorted.

Complexity: Average O(n log n), worst O(n²).
 */
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        // Call quickSort on the entire array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Quick Sort function that recursively sorts subarrays
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);  // Sort elements before the pivot
            quickSort(arr, pi + 1, high); // Sort elements after the pivot
        }
    }

    // Partition function to rearrange elements around the pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = (low - 1);     // Index of smaller element

        // Iterate through the array to place elements smaller than pivot to the left
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partition index
        return i + 1;
    }
}

