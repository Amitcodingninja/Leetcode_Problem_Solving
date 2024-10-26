package JavaDSACourse.Array;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5};
        isSorted(arr);
    }

    public static void isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}