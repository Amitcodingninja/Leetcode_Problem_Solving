package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listAndSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Limit the first 3 elements

        List<Integer> limited = numbers.stream().limit(5).collect(Collectors.toList());
        System.out.println(limited);

        // Skip first 5
        List<Integer> skipElem = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipElem);


    }
}
