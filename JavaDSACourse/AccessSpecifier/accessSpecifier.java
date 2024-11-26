package JavaDSACourse.AccessSpecifier;
class PrivateClass
{
   private int a = 10;
   public  void  m1 ()
   {
       System.out.println(a);
   }
}

public class accessSpecifier {
    public static void main(String[] args) {
        PrivateClass p = new PrivateClass();
        p.m1();
//        p.a;

    }

}
