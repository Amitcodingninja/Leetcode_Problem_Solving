package JavaDSACourse.Oops.Abstraction;

class ATMDemo {
    private int bal = 1000000000;
    private int lastTran = 100;
    private String password = "123";
    private String account = "23432"; // Make sure this matches in getBal method

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public int getLastTran() {
        return lastTran;
    }

    public void setLastTran(int lastTran) {
        this.lastTran = lastTran;
    }

    public String checkBalance(String password, String account) {
        if (this.password.equals(password) && this.account.equals(account)) {
            return "Your account balance is " + this.bal;
        } else {
            return "Incorrect Password or Account Number";
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        ATMDemo atmDemo = new ATMDemo();
        String res = atmDemo.checkBalance("123", "23432");
        System.out.println(res);
    }
}
