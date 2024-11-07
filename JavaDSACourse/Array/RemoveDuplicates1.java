package JavaDSACourse.Array;
// Leetcode 26
public class RemoveDuplicates1 {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

        // Print original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call removeDuplicates1 method to remove duplicates
        int uniq = removeDuplicates1(arr);

        // Print modified array with unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniq; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print the new length
        System.out.println("New length of array: " + uniq);
    }

    // The removeDuplicates1 method as provided
    public static int removeDuplicates1(int[] arr) {
        if (arr.length == 0) return 0;
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}
