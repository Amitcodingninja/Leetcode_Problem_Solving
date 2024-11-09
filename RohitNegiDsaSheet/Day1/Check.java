package RohitNegiDsaSheet.Day1;

import java.util.Arrays;

public class Check {
    public static boolean check(int[] arr1, int[] arr2) {
        // If the lengths of the arrays are not the same, they can't be equal.
        if (arr1.length != arr2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare each element in the sorted arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Return false if any pair of elements do not match
            }
        }

        return true; // All elements matched, so the arrays are equal
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};

        if (check(arr1, arr2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
