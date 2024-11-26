package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Jayda", "Pooja", "Anjali");

        long count = names.stream().count();
        System.out.println(count);// 4

    }
}
