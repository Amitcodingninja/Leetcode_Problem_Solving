package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Filter even number
        List<Integer> evenNum = number.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNum);
    }
}
