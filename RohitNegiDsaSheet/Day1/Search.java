package RohitNegiDsaSheet.Day1;

public class Search {

    static int search(int arr[], int x) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to x
            if (arr[i] == x) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if x is not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 3;
        int result = search(arr, x);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}