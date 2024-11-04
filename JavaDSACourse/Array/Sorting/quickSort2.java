package JavaDSACourse.Array.Sorting;

import java.util.Arrays;
/*

1. The `partition` function selects the starting element as the pivot and counts how many elements are smaller
 than or equal to it.
2. It places the pivot in its correct sorted position by swapping it to its calculated index (`pivotIdx`).
3. Using two pointers (`i` from the start and `j` from the end), it rearranges elements so that values less
than the pivot are on the left and greater values are on the right.
4. Finally, it returns the pivot's index, which is used to recursively sort the left and right subarrays in
`quickSort`.

 */

public class quickSort2 {

    // Function to swap two elements in the array
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Partition function to rearrange elements based on the pivot
    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[st]; // Choosing the starting element as the pivot
        int cnt = 0; // Counter for elements less than or equal to pivot

        // Count elements less than or equal to pivot in the rest of the array
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                cnt++; // Increment count if element is less than or equal to pivot
        }

        int pivotIdx = st + cnt; // Calculate the final position for the pivot
        swap(arr, st, pivotIdx); // Move pivot to its final position in the sorted array

        // Initializing pointers to partition the array around the pivot
        int i = st;
        int j = end;

        // Loop to arrange elements around the pivot position
        while (i < pivotIdx && j > pivotIdx) { // Continue until pointers cross the pivot position
            while (arr[i] <= pivot) i++; // Move 'i' forward if current element is less than or equal to pivot
            while (arr[j] > pivot) j--; // Move 'j' backward if current element is greater than pivot

            // Swap elements if 'i' is on the left of pivot and 'j' is on the right of pivot
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j); // Swap elements at 'i' and 'j'
                i++; // Move 'i' forward after swap
                j--; // Move 'j' backward after swap
            }
        }

        return pivotIdx; // Return the final position of the pivot
    }


    // Recursive quicksort function
    public static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;

        int pi = partition(arr, st, end);  // Partition the array
        quickSort(arr, st, pi - 1);        // Sort the left part
        quickSort(arr, pi + 1, end);       // Sort the right part
    }

    public static void main(String[] args) {
        int[] arr = {6, 6, 3, 1, 5, 5, 4};

        quickSort(arr, 0, arr.length - 1);  // Sorting the array

        // Printing the sorted array using toString
        System.out.println(Arrays.toString(arr));
    }
}
