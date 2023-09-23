import java.util.ArrayList;
import java.util.List;


abstract class Hackerearth{
    abstract void code ( );
}

class hackster extends Hackerearth{
    void code ( ) {
        System.out.println( "Hackster loves to code on Hackerearth");
    }
}
public class visteon_Q1 {
    public static void main(String[] args) {
        StringBuffer s =new StringBuffer("Hackerearth");
        s.append(4).deleteCharAt(3).delete(3, s.length()- 1);
        System.out.println(s);
    }
}
