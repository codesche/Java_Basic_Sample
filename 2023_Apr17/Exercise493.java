import java.util.HashMap;
import java.util.Map;

public class Exercise493 {
    public static void main(String[] args) {
        String k1 = "b2";
        System.out.println(k1.hashCode());
        String k2 = "aQ";
        System.out.println(k2.hashCode());
        Map<String, String> map = new HashMap<String, String>();
        map.put(k1, "v1");
        map.put(k1, "v2");
        System.out.println(map.size());
    }
}
