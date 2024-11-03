public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println(maxSubArray(arr));
//        System.out.println("अधिकतम");
    }


    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int max_so_far = nums[0];  // Initialize with the first element
        int max_ending_here = nums[0];

        for (int i = 1; i < nums.length; i++) {
//            max_ending_here(अधिकतम यहीं समाप्त हो रहा है) = Math.max(nums[i], max_ending_here + nums[i]);  // Update the current max subarray sum
//            max_so_far(अब तक अधिकतम) = Math.max(max_so_far, max_ending_here);  // Update the overall max sum
            max_ending_here = Math.max(nums[i], max_ending_here + nums[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }
}
