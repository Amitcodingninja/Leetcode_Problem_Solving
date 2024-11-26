package JAVA8.Default;

public class defaultMethod {
    public interface Animal {
        void eating();

        void sleeping();

        default void thinking() {
            System.out.println("Animal is thinking");
        }

        default void running() {
            System.out.println("Animal is running");
        }
    }

    public static class Dog implements Animal {

        @Override
        public void eating() {
            System.out.println("Dog is eating");

        }

        @Override
        public void sleeping() {
            System.out.println("Dog is sleeping");


        }

        @Override
        public void thinking() {
            System.out.println("Dog is thinking");

        }

        @Override
        public void running() {
            System.out.println("Dog is running");

        }
    }

    public static class Cat implements Animal {

        @Override
        public void eating() {
            System.out.println("Cat is eating");

        }

        @Override
        public void sleeping() {
            System.out.println("Cat is sleeping");


        }

        @Override
        public void thinking() {
            System.out.println("Cat is thinking");

        }

        @Override
        public void running() {
            System.out.println("Cat is running");

        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal.eating();
        animal1.eating();


    }

}
