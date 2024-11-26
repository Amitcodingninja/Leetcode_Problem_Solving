package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 3, 2, 4);
        // Sort in ascending order
        List<Integer> sortedNumber = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumber);
    }
}
