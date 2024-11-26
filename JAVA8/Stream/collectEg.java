package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectEg {
    public static void main(String[] args) {
//        a) collect()
//        Stream ke result ko List, Set, etc., mein collect karne ke liye.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Collect into a list
        List<String> nameList = names.stream().collect(Collectors.toList());
        System.out.println(nameList);

    }
}
