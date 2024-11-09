package RohitNegiDsaSheet.Day2;

public class binarySorting {


    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0};
        binSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void binSort(int[] arr) {
        int index = 0;

        // Place 0 at the begining
        for (int num : arr) {
            if (num == 0) {
                arr[index++] = 0;
            }

        }
        while (index < arr.length) {
            arr[index++] = 1;
        }
    }
}
