package RohitNegiDsaSheet.Day1;

public class FindMissing {

    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 16, 21, 31};

        System.out.println(findMissing(arr)); // Expected output: 6
    }

    public static int findMissing(int[] arr) {
        int d = (arr[arr.length - 1] - arr[0]) / arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != d) {
                return arr[i] + d;
            }
        }
        return -1;
    }
}
