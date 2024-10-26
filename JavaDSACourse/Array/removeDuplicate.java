package JavaDSACourse.Array;

// When Array is Sorted
public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int newLength = removeDuplicates(arr);

        // Print the unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int j = 0; // Index of the last unique element found
        // Loop starts from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is different from the last unique element
            if (arr[i] != arr[j]) {
                j++;            // Move the unique index forward
                arr[j] = arr[i]; // Update the position with the new unique element
            }
        }

        return j + 1; // `j + 1` gives the count of unique elements
    }
}
