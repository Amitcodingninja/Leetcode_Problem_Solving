package GFGTopArray50;

//Question Link 1 :- https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

public class minandmaxOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        System.out.println("Maximum Element "+max(arr));
        System.out.println("Minimum Element "+min(arr));

    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
