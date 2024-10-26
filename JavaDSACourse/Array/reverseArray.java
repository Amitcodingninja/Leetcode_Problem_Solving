package JavaDSACourse.Array;

public class reverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        revArr(arr);

    }
    public  static  void revArr(int arr [])
    {
        for(int i =arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
