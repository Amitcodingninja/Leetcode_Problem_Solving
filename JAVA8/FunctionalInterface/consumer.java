package JAVA8.FunctionalInterface;

import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        Consumer<String> printMessage = message-> System.out.println("Message " +message);
        printMessage.accept("Hello , Functional Interface!");
    }
}
