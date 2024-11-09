package RohitNegiDsaSheet.Day2;
import java.util.Arrays;

public class GetMinMax {

    public static long[] getMinMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);  // Sort the array
        return new long[]{arr[0], arr[n - 1]};  // Return an array with min and max values
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};

        // Call the getMinMax method and store the result
        long[] result = getMinMax(arr);

        // Print the result
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}
