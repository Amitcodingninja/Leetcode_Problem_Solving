package JavaDSACourse.Oops;
class SharmaJi
{
    String plot ="200Gaj";
    public String prop ()
    {
        return plot;
    }
}
class SharmaJeekaBeta extends SharmaJi
{

}


public class inhertance {
    public static void main(String[] args) {
        SharmaJi sj = new SharmaJi();
        SharmaJeekaBeta sb = new SharmaJeekaBeta();
        String prop = sj.plot;
        String propb = sb.plot;
        System.out.println(prop);
        System.out.println(propb);
    }


}
