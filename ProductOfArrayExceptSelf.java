import java.util.Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4}; // Example input array
        // Call the productExceptSelf method and print the result as a readable string
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }

    /**
     * Method to calculate the product of all elements except self for each position in the array.
     *
     * @param nums Input array of integers
     * @return An array where each element is the product of all elements in nums except itself
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n]; // Output array to store the results

        // Step 1: Calculate prefix products
        ans[0] = 1; // Initialize the first element of ans to 1 (no elements before the first one)
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1]; // Store product of all elements to the left of i
        }

        // Step 2: Calculate suffix products and combine with prefix products
        int suffix = 1; // Initialize suffix product as 1 (no elements after the last one)
        for (int j = n - 1; j >= 0; j--) {
            ans[j] = ans[j] * suffix; // Multiply prefix product at ans[j] with suffix product
            suffix = suffix * nums[j]; // Update suffix product for the next element on the left
        }

        return ans; // Return the final product array
    }

    public static int[] productExceptSelf2(int[] nums) {
        // Arrays to store prefix and suffix products for each element
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        // Initialize the first element of prefix to 1, as there are no elements to its left
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            // Calculate prefix product for each position
            // Each element in prefix[i] is the product of all elements to the left of i in nums
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Initialize the last element of suffix to 1, as there are no elements to its right
        suffix[suffix.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            // Calculate suffix product for each position
            // Each element in suffix[i] is the product of all elements to the right of i in nums
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Final result array to hold product of elements except self for each index
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            // Multiply corresponding prefix and suffix products to get the final result for each index
            ans[i] = prefix[i] * suffix[i];
        }

        return ans; // Return the array with the product of elements except self for each index
    }

}
