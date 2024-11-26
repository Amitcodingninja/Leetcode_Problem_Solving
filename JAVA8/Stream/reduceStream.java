package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;

//Stream ke elements ko ek single value mein reduce karne ke liye.

public class reduceStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

//        sum of all
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

}
