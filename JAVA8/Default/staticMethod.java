package JAVA8.Default;

public class staticMethod {
    public static void main(String[] args) {
        utility.printMessage("Ye mera Bhasan hai ");// Apna Output
    }
}

interface utility {
    static void printMessage(String message) {
        System.out.println("Message: " + message);

    }

}