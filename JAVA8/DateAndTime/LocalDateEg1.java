package JAVA8.DateAndTime;

import java.time.LocalDate;

public class LocalDateEg1 {
    public static void main(String[] args) {
        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date " + today);

        // Specific Date
        LocalDate independenceDay = LocalDate.of(1947, 8, 15);
        System.out.println("Independence Day " + independenceDay);

        // Adding days
        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Date Next Week: " + nextWeek);

    }
}
