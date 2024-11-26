package JavaDSACourse.AccessSpecifier;
class DefaultClass
{
    int a =20;

    public  void m1()
    {
        System.out.println(a);

    }
}

public class DefaultP01 {
    public static void main(String[] args) {
        DefaultClass c = new DefaultClass();
        c.m1();
    }

}
