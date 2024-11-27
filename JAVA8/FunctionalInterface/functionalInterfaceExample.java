package JAVA8.FunctionalInterface;

public class functionalInterfaceExample {
    public static void main(String[] args) {
        //Lambda implementation
        Greeting greeting = (name -> System.out.println("Hello, " + name + "!"));
        greeting.sayHello("John");// Output: Hello, John!
    }
}

interface Greeting {
    void sayHello(String name);
}