import java.util.Arrays;

class MoveZeroToEnd283 {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }

}


    public static void main(String[] args) {
        MoveZeroToEnd283 mover = new MoveZeroToEnd283();

        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(nums));

        mover.moveZeroes(nums);

        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
    }
}
