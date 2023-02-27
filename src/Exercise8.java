import java.util.HashMap;

public class Exercise8 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map.get("one"));
        System.out.println(map.get("three"));
    }
}
