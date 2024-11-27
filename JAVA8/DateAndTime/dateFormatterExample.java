package JAVA8.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFormatterExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Parsing
        String dateStr = "15-08-1947";
        LocalDate parsedDate = LocalDate.parse(dateStr,formatter);
        System.out.println("Parsed Date: "+parsedDate);
    }
}
