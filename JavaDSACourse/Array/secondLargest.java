package JavaDSACourse.Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        secondLargest(arr);
        secondLargest sl = new secondLargest();
        System.out.println(sl.getSecondLargest(arr));


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
        if (secondL == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + secondL);
        }
        System.out.println(secondL);
    }


    public int getSecondLargest(int[] arr) {
        // Code Here
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            if(i==1)
            {
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        System.out.println("Second Largest Element "+arr[1]);
        System.out.println("Second Smallest Element "+arr[1]);
        return arr[1];

    }




}