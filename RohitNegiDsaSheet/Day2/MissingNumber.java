package RohitNegiDsaSheet.Day2;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3};
        int n = 4;
        System.out.println(missingNumber(n,arr));

    }

    public static int missingNumber(int n, int[] arr) {
        // code here
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return totalSum-arraySum;
    }
}
