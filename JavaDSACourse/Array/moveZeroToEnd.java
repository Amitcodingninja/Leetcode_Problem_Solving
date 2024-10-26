package JavaDSACourse.Array;

public class moveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroToEnd(arr);

    }

    public static void moveZeroToEnd(int[] arr) {
        int index = 0;  // Initialize an index to keep track of the position for non-zero elements

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not zero, place it at the `index` position
            if (arr[i] != 0) {
                arr[index++] = arr[i];  // Increment `index` after placing the non-zero element
            }
        }

        // After placing all non-zero elements, fill the rest of the array with zeros
        while (index < arr.length) {
            arr[index++] = 0;  // Set the remaining positions to zero
        }

        // Print the modified array to show the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
