package JAVA8.FunctionalInterface;

import java.util.function.Predicate;

public class predicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven =n->n%2==0;
        System.out.println(isEven.test(4));
    }
}
