import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InterctionOfTwoElementII {

    public static void main(String[] args) {
        InterctionOfTwoElementII solution = new InterctionOfTwoElementII();

        // Test data
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        // Using HashMap solution
        int[] resultHashMap = solution.intersectUsingHashMap(nums1, nums2);
        System.out.println("Intersection using HashMap: " + Arrays.toString(resultHashMap));

        // Using Sorting solution
        int[] resultSorting = solution.intersectUsingSorting(nums1, nums2);
        System.out.println("Intersection using Sorting: " + Arrays.toString(resultSorting));
    }

    public int[] intersectUsingSorting(int[] nums1, int nums2[]) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        while (i < nums1.length && j < nums1.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;

            } else {
                resultList.add(nums1[i]);
                i++;
                j++;

            }

        }
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        return result;
    }

    public  int [] intersectUsingHashMap(int [] nums1,int [] nums2)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int num : nums1)
        {
            map.put(num,map.getOrDefault(num , 0)+1);

        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}






