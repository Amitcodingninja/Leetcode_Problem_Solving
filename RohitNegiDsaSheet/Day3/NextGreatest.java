package RohitNegiDsaSheet.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class NextGreatest {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        nextGreatest(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function 'nextGreatest' ek array input leta hai aur uske baad ke greatest elements ko ArrayList mein store karke return karta hai.
    public static ArrayList<Integer> nextGreatest(int arr[]) {
        // Result ArrayList ko initialize karte hain jo final output hoga.
        ArrayList<Integer> result = new ArrayList<>();

        // 'gtr' ko -1 se initialize karte hain, jo har element ke baad ka greatest element store karega.
        int gtr = -1;
        // Loop reverse order mein chalate hain, array ke last element se start karte hain.
        for (int i = arr.length - 1; i >= 0; i--) {
            // Har element ke liye, current greatest element ko result ke starting position pe add karte hain.
            result.add(0, gtr);

            // 'gtr' ko update karte hain, jo ab current element aur purane 'gtr' mein se maximum value hoga.
            gtr = Math.max(gtr, arr[i]);
        }

        // Final result ko return karte hain.
        return result;
    }

}
