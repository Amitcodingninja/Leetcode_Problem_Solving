package JAVA8.DateAndTime;

import java.time.Duration;
import java.time.LocalTime;

public class durationExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(17,0);

        Duration workHours = Duration.between(start,end);
        System.out.println("Work Hours: "+workHours.toHours() +" hours");
    }
}
