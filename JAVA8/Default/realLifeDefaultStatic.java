package JAVA8.Default;

public class realLifeDefaultStatic {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(500);
        payment.showRecipt();
        Payment.printPaymentOption();
    }
}

interface Payment {
    void pay(int amount);

    // Default Method
    default void showRecipt() {
        System.out.println("Recipt : Payment Successful");

    }

    //Static Method
    static void printPaymentOption() {
        System.out.println("Payment Option : Credit Card,Debit Card,UPI");

    }
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " Using Credit card.");
    }
}
