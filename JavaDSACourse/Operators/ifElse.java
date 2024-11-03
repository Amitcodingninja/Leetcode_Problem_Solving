package JavaDSACourse.Operators;

public class ifElse {
    public static void main(String[] args) {
        int rupee = 10;
        if (rupee > 2) {
            System.out.println("toffee leli");
            rupee = rupee - 2;
            if (rupee > 5) {

                System.out.println("Munch bhi leli");
                rupee = rupee - 5;
                if (rupee > 5) {
                    System.out.println("lays bhi leli");
                } else {
                    System.out.println("Lays Nhi le paya");
                    if (rupee > 2) {
                        System.out.println("Orange wali tofee leli");
                        rupee = rupee - 2;
                        if (rupee > 1) {
                            System.out.println("Mangobite leli");
                            rupee = rupee - 1;
                            if (rupee >= 1) {
                                System.out.println("Bubble gum leli");
                            } else {
                                System.out.println("Bank Cruppt");
                            }
                        } else {

                            System.out.println("Paise Khatam");

                        }
                    }
                }

            } else {
                System.out.println("Munch nhi le paya");
            }
        } else {
            System.out.println("Sorry bhai paise nhi hai");
        }
        System.out.println("Program Khatam");


    }
}
