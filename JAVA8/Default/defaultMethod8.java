package JAVA8.Default;

public class defaultMethod8 {
    public static void main(String[] args) {
//        Vehicle car = new car();
//        car.start();
//        car.stop();
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}

interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");

    }

//    public void stop() {
//        System.out.println("Car Stoped");
//    }

}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void stop() {
        System.out.println("Bike is Stopped with Breaks");
    }
}
