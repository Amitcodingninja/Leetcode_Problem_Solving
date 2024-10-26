package JavaDSACourse.Operators;

public class OperatorP01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(b
//        /a);
//        System.out.println(b%a);

        // Increment Operator
        int c = 2;
        c++;
//        System.out.println(c);
        --c;
//        System.out.println(c);
        //pre ---> ++c --c Pehle icre/dec then oper
//        Post ---> c++ c-- Pehle oper then incre/dec
        int d = 5;
//        int k= ++d + --d + d++ - --d + d++ ;
//        System.out.println(d);

        int k = d++;
//        System.out.println(k);
        int g=10;
        int res = g++ - g-- + ++g + ++g + --g + g-- + g++ +--g;
        System.out.println(res);

    }
}
//
//part1 = g++: part1 = 10, g becomes 11
//part2 = g--: part2 = 11, g becomes 10
//part3 = ++g: g becomes 11, part3 = 11
//part4 = ++g: g becomes 12, part4 = 12
//part5 = --g: g becomes 11, part5 = 11
//part6 = g--: part6 = 11, g becomes 10
//part7 = g++: part7 = 10, g becomes 11
//part8 = --g: g becomes 10, part8 = 10