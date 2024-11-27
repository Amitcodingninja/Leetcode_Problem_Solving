package JAVA8.DateAndTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Current Time
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // Specific Time
        LocalTime meetingTime = LocalTime.of(10, 30);
        System.out.println(meetingTime);

        // Adding Hours
        LocalTime later = now.plusHours(2);
        System.out.println("2 Hours Later : " + later);
    }
}
