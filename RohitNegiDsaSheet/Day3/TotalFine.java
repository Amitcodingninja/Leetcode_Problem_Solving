package RohitNegiDsaSheet.Day3;

import java.util.Arrays;
//Find the fine

public class TotalFine {
    public static void main(String[] args) {
        int[] car = {2375, 7682, 2325, 2352};
        int[] fine = {250, 500, 350, 200};
        int date = 12;
        System.out.println(totalFine(date, car, fine));

    }

    public static long totalFine(int date, int car[], int fine[]) {
        long fineSum = 0; // Use long as the return type is long

        for (int i = 0; i < car.length; i++) {
            // Check if the date is even and car is odd OR date is odd and car is even
            // Agar date even hai to odd-numbered cars se fine collect karo,
            // aur agar date odd hai to even-numbered cars se fine collect karo.

            if ((date % 2 == 0 && car[i] % 2 != 0) || (date % 2 != 0 && car[i] % 2 == 0)) {
                fineSum += fine[i];
            }
        }

        return fineSum;
    }

}
