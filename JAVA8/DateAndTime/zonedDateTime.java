package JAVA8.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTime {
    public static void main(String[] args) {
        // Current date and time with timeZone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current DateTime in India: "+zonedDateTime);

        // Converting timezone
        ZonedDateTime nyDateTime  =zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Current DateTime in New York: "+nyDateTime);

    }

}
