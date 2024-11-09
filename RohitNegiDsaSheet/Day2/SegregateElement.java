package RohitNegiDsaSheet.Day2;

//Move all negative elements to end
public class SegregateElement {
    public static void segregateElements2(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return;

        int[] a = new int[n];
        int i = 0;
        for (int x = 0; x < n; x++) {
            if (arr[x] >= 0) {
                a[i] = arr[x];
                i++;
            }
        }
        for (int x = 0; x < n; x++) {
            if (arr[x] < 0) {
                a[i] = arr[x];
                i++;
            }
        }
        for (int x = 0; x < n; x++) {
            arr[x] = a[x];
        }
    }

    public static void segregateElements1(int[] arr) {
        int n = arr.length;
        int position = 0;//Place next positive number
        //Move positive elements to the start of the array while maintaing order
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int temp = arr[i];
                // Shift element to right to make space for the positive number
                for (int j = i; j > position; j--) {
                    arr[j] = arr[j - 1];

                }
                arr[position] = temp;
                position++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
//        segregateElements(arr);
//        segregateElements1(arr);

        segregateElements2(arr);

        // Print the segregated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void segregateElements(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // Store all positive numbers in the temp array
        for (int num : arr) {
            if (num > 0) {
                temp[index++] = num;
            }
        }

        // Store all negative numbers in the temp array
        for (int num : arr) {
            if (num < 0) {
                temp[index++] = num;
            }
        }

        // Copy elements from temp back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }


    }

}

