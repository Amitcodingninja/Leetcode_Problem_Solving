package JAVA8.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Current Date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime " + now);

        // Specific Date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2024,12,25,18,30);
        System.out.println("Christmas Celebration: "+specificDateTime);
    }
}
