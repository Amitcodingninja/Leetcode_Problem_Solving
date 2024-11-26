package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // Find the first number
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(System.out::println); // Output: 1

        // Find any number
        Optional<Integer> any = numbers.stream().findAny();
        any.ifPresent(System.out::println); // Output: (Could be any element)
    }
}
