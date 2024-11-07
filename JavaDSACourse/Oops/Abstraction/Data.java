package JavaDSACourse.Oops.Abstraction;

public class Data {
    private String name = "Amit";
    private String passWord = "123";

    public String checkBal(String passWord)
    {
        if (passWord.equals(passWord))
        {
            System.out.println("Go for Payment");

        }
        else {
            System.out.println("Pin Not Match");
        }
        return " ";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d.getName());
    }
}
