package JavaDSACourse.Array;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(missing(arr));

    }

    public static int missing(int[] arr) {
        int n = arr.length + 1;
        int arradd = 0;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            arradd += arr[i];
        }
        return sum - arradd;
    }

}
