import java.util.IdentityHashMap;
import java.util.Map;

public class Exercise522 {
    public static void main(String[] args) {
        Map objMap = new IdentityHashMap();

        Object o1 = new Integer(123);
        Object o2 = new Integer(123);
        objMap.put(o1, "first");
        objMap.put(o2, "second");

        Object v1 = objMap.get(o1);
        Object v2 = objMap.get(o2);

        System.out.println(v1);
        System.out.println(v2);
    }
}
