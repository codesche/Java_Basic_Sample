import java.util.HashMap;
import java.util.Map;

public class Exercise492 {
    public static void main(String[] args) {
        System.out.println("--testIterator--");
        String k1 = "b2";
        String k2 = "aQ";
        Map<String, String> map = new HashMap<String, String>();
        map.put(k1, "v1");
        map.put(k2, "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        map.put("k5", "v5");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for (String key : map.values()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
