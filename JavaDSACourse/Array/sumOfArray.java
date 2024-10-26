package JavaDSACourse.Array;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 10};
        sum(arr);
    }

    public static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
