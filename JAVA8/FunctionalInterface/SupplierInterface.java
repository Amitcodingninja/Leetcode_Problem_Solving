package JAVA8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String> supplierMessage = () -> "This is a supplied Message. ";
        System.out.println(supplierMessage.get());
    }
}
