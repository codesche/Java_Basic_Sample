import java.util.HashMap;

public class Exercise490 {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();

        hMap.put("One", new Integer(1));
        hMap.put("Two", new Integer(2));

        Object obj = hMap.get("One");
        System.out.println(obj);
    }
}
