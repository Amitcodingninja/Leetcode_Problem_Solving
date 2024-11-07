package JavaDSACourse.Array;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int uniqueCount = removeDuplicates(nums);
//        System.out.print("Array after removing duplicates: ");
//        for (int i = 0; i < uniqueCount; i++) {
//            System.out.print(nums[i] + " ");
//        }
        int uniq =removeDuplicates1(nums);
        for (int i = 0; i < uniq; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

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

    public static int removeDuplicates(int[] nums) {
        int uniqueCount = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;

            // Check if nums[i] is a duplicate of any previous element
            for (int j = 0; j < uniqueCount; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, place it at `uniqueCount` index
            if (!isDuplicate) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        // Return the count of unique elements
        return uniqueCount;
    }
}
