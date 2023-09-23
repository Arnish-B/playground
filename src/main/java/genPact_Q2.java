import java.util.ArrayList;
import java.util.List;

interface A {void x(); }
class B implements A { public void x() {} public void yu() {} }
class C extends B { public void x() {} }
public class genPact_Q2 {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new B());
        list.add(new C());
        for(A a : list) {
            a.x();
//            a.y();
        }
    }
}
