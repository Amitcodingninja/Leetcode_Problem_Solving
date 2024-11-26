package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 3, 4, 4, 5);

        // Remove Duplicates
        List<Integer> distinctNumber = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumber);
    }
}
