package RohitNegiDsaSheet.Day1;

public class RotateBy1 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] arr) {
        // code here
        if (arr.length <= 1) return;
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

    }
}
