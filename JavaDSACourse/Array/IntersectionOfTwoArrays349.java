package JavaDSACourse.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = intersection(nums1, nums2);
        int[] res1 = intersection1(nums1, nums2);

        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res1));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
// Sort both Array
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> resultSet = new HashSet<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultSet.add(nums1[i]);
                i++;
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        //Convert Set to Array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                ans.add(num);
                set.remove(num);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

}
