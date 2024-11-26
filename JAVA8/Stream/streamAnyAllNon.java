package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;

public class streamAnyAllNon {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Check if any number is even
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);

        // Check all number are positive
        boolean allPositve = numbers.stream().allMatch(n -> n > 0);
        System.out.println(allPositve);

        // Check if no number is greater than 10
        boolean nonGreaterThanTen = numbers.stream().noneMatch(n -> n > 10);
        System.out.println(nonGreaterThanTen);
    }
}

// Output