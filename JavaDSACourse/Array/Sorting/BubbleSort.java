package JavaDSACourse.Array.Sorting;
/*
Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order,
 pushing the largest unsorted element to the end of the array in each pass.
**Logic:**
        1. For each pass, iterate through the array.
        2. If the current element is greater than the next, swap them.
        3. Repeat until the array is sorted.
**Complexity:** \(O(n^2)\) in the worst and average cases.
Number of rounds = element -1;
*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {36, 19, 29, 12, 5};
        String[] a = {"Zain", "Amit", "Aman", "Pooja"};

        // Call the bubbleSort method to sort the array
        bubbleSort(arr);
        bubbleSortforString(a);


        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(a));
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        // Outer loop for each pass through the array
        for (int i = 0; i < arr.length; i++) {
            int flag = 0; // Flag to check if any swapping happened in this pass

            // Inner loop to compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1; // Set flag to 1 as swapping has happened
                }
            }

            // If no swapping occurred, the array is already sorted
            if (flag == 0) {
                break;
            }
        }
    }

    public static void bubbleSortforString(String[] arr) {
        String temp;
        // Outer loop for each pass through the array
        for (int i = 0; i < arr.length; i++) {
            int flag = 0; // Flag to check if any swapping happened in this pass

            // Inner loop to compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Compare two adjacent elements using compareTo() method
                // If arr[j] is lexicographically greater than arr[j + 1], swap them
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap elements to put them in lexicographical order
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1; // Set flag to 1 as swapping has happened
                }
            }

            // If no swapping occurred during the inner loop, the array is already sorted
            if (flag == 0) {
                break; // Exit the loop early as the array is sorted
            }
        }
    }

}
