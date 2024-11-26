package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;

//Stream ke har element par action perform karne ke liye.


public class forEachStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // Print Each Number
        numbers.stream().forEach(System.out::print);
    }
}
