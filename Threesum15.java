import java.util.*;

public class Threesum15 {
    public static void main(String[] args) {
        // Sample input array
        int[] nums = {-1, 0, 1, 2, -1, -4};
        // Print the list of triplets that sum to zero
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // Set to store unique triplets
        Set<List<Integer>> res = new HashSet<>();
        // If the array has less than 3 elements, return an empty list
        if (nums.length < 3) return new ArrayList<>(res);

        // Sort the array to facilitate the two-pointer approach
        Arrays.sort(nums);

        // Iterate through the sorted array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Initialize two pointers: 'j' starts right after 'i', 'k' at the end of the array
            int j = i + 1;
            int k = nums.length - 1;
            // Use the two-pointer technique to find pairs that sum to the negative of nums[i]
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // If the sum is zero, we found a triplet
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; // Move 'j' to the right
                    k--; // Move 'k' to the left
                    // Skip duplicates for 'j'
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    // Skip duplicates for 'k'
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
                // If the sum is less than zero, move 'j' to the right to increase the sum
                else if (sum < 0) {
                    j++;
                }
                // If the sum is greater than zero, move 'k' to the left to decrease the sum
                else {
                    k--;
                }
            }
        }

        // Return the unique triplets as a list
        return new ArrayList<>(res);
    }
}
