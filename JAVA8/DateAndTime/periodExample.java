package JAVA8.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class periodExample {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2000, 1, 1);
        LocalDate today = LocalDate.now();

        Period difference = Period.between(start, today);
        System.out.println("Years: " + difference.getYears());
        System.out.println("Month: " + difference.getMonths());
        System.out.println("days: " + difference.getDays());
    }
}
