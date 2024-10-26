package JavaDSACourse.Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        secondLargest(arr);
    }

    public static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondL = largest;
                largest = arr[i];
            } else if (arr[i] > secondL && arr[i] != largest) {
                secondL = arr[i];
            }
        }
//        if (secondL == Integer.MIN_VALUE) {
//            System.out.println("No second largest element found.");
//        } else {
//            System.out.println("Second Largest Element: " + secondL);
//        }
        System.out.println(secondL);
    }
}