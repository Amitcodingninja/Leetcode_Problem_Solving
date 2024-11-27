package JAVA8.FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, String> convertToString = n -> "Number: " + n;

        System.out.println(convertToString.apply(10)); // Output: Number: 10
    }
}
